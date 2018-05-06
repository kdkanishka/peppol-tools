package com.kani.peppol;

import com.kani.exception.LookupUIException;
import com.kani.peppol.model.LookupEnvironmentEnum;
import no.difi.vefa.peppol.common.lang.PeppolLoadingException;
import no.difi.vefa.peppol.common.model.DocumentTypeIdentifier;
import no.difi.vefa.peppol.common.model.ParticipantIdentifier;
import no.difi.vefa.peppol.common.model.ServiceMetadata;
import no.difi.vefa.peppol.lookup.LookupClient;
import no.difi.vefa.peppol.lookup.LookupClientBuilder;
import no.difi.vefa.peppol.lookup.api.LookupException;
import no.difi.vefa.peppol.security.lang.PeppolSecurityException;

import java.util.List;

public class LookupUtil {
    public LookupUtil() {

    }

    public List<DocumentTypeIdentifier> fetchDocumentIdentifiers(String peppolId, LookupEnvironmentEnum lookupEnv)
            throws LookupUIException {
        ParticipantIdentifier participantIdentifier = ParticipantIdentifier.of(peppolId);
        try {
            LookupClient lookupClient = getLookupClient(lookupEnv);
            List<DocumentTypeIdentifier> documentTypeIdentifiers =
                    lookupClient.getDocumentIdentifiers(participantIdentifier);
            return documentTypeIdentifiers;
        } catch (PeppolLoadingException e) {
            throw new LookupUIException(e.getMessage(), e);
        } catch (LookupException e) {
            throw new LookupUIException(e.getMessage(), e);
        }
    }

    public ServiceMetadata fetchServiceMetadata(String peppolId, DocumentTypeIdentifier documentTypeIdentifier,
                                                LookupEnvironmentEnum lookupEnv) throws LookupUIException {
        ParticipantIdentifier participantIdentifier = ParticipantIdentifier.of(peppolId);
        try {
            LookupClient lookupClient = getLookupClient(lookupEnv);
            ServiceMetadata serviceMetadata = lookupClient.getServiceMetadata(participantIdentifier, documentTypeIdentifier);
            return serviceMetadata;
        } catch (PeppolLoadingException e) {
            throw new LookupUIException(e.getMessage(), e);
        } catch (PeppolSecurityException e) {
            throw new LookupUIException(e.getMessage(), e);
        } catch (LookupException e) {
            throw new LookupUIException(e.getMessage(), e);
        }
    }

    private LookupClient getLookupClient(LookupEnvironmentEnum lookupEnv) throws PeppolLoadingException {
        LookupClient lookupClient;
        if (lookupEnv == LookupEnvironmentEnum.PROD) {
            lookupClient = LookupClientBuilder.forProduction().build();
        } else {
            lookupClient = LookupClientBuilder.forTest().build();
        }
        return lookupClient;
    }
}
