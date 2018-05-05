package com.kani.peppol;

import com.kani.exception.LookupUIException;
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

    public List<DocumentTypeIdentifier> fetchDocumentIdentifiers(String peppolId) throws LookupUIException {
        ParticipantIdentifier participantIdentifier = ParticipantIdentifier.of(peppolId);
        try {
            LookupClient lookupClient = LookupClientBuilder.forProduction().build();
            List<DocumentTypeIdentifier> documentTypeIdentifiers =
                    lookupClient.getDocumentIdentifiers(participantIdentifier);
            return documentTypeIdentifiers;
        } catch (PeppolLoadingException e) {
            throw new LookupUIException("Unable to load lookup client", e);
        } catch (LookupException e) {
            throw new LookupUIException("Unable to load lookup client", e);
        }
    }

    public ServiceMetadata fetchServiceMetadata(String peppolId, DocumentTypeIdentifier documentTypeIdentifier) throws LookupUIException {
        ParticipantIdentifier participantIdentifier = ParticipantIdentifier.of(peppolId);
        try {
            LookupClient lookupClient = LookupClientBuilder.forProduction().build();
            ServiceMetadata serviceMetadata = lookupClient.getServiceMetadata(participantIdentifier,documentTypeIdentifier);
            return serviceMetadata;
        } catch (PeppolLoadingException e) {
            throw new LookupUIException("Unable to load lookup client", e);
        } catch (PeppolSecurityException e) {
            throw new LookupUIException("Unable to get service metadata due to peppol security concerns", e);
        } catch (LookupException e) {
            throw new LookupUIException("Unable to perform lookup", e);
        }
    }
}
