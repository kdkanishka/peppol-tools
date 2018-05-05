package com.kani;

import com.kani.ui.PeppolToolUI;
import no.difi.vefa.peppol.common.lang.EndpointNotFoundException;
import no.difi.vefa.peppol.common.lang.PeppolLoadingException;
import no.difi.vefa.peppol.common.model.*;
import no.difi.vefa.peppol.lookup.LookupClient;
import no.difi.vefa.peppol.lookup.LookupClientBuilder;
import no.difi.vefa.peppol.lookup.api.LookupException;
import no.difi.vefa.peppol.security.lang.PeppolSecurityException;

import java.util.List;

/**
 * https://github.com/difi/vefa-peppol/tree/master/peppol-lookup
 */

public class Main {
    public static void main(String[] args) throws PeppolLoadingException, LookupException, EndpointNotFoundException, PeppolSecurityException {
//        ParticipantIdentifier participantIdentifier = ParticipantIdentifier.of("9908:222222222");
//        LookupClient lookupClient = LookupClientBuilder.forProduction().build();
//        List<DocumentTypeIdentifier> documentTypeIdentifiers =
//                lookupClient.getDocumentIdentifiers(participantIdentifier);
//        for(DocumentTypeIdentifier documentTypeIdentifier : documentTypeIdentifiers){
//            String[] splitedId = documentTypeIdentifier.getIdentifier().split("##");
//            String docIdf = splitedId[0];
//            String procId = splitedId[1];
//
//            System.out.println("---------------------------------------------------------------");
//            System.out.println("Identifier \t" + documentTypeIdentifier.getIdentifier());
//            System.out.println("Scheme \t" + documentTypeIdentifier.getScheme().getIdentifier());
//            System.out.println("Doc Id \t" + docIdf);
//            System.out.println("Proc Id \t" + procId);
//
//            ServiceMetadata serviceMetadata = lookupClient.getServiceMetadata(participantIdentifier,documentTypeIdentifier);
//
//            System.out.println("Done!");
//        }
        PeppolToolUI peppolToolUI = new PeppolToolUI();
        peppolToolUI.setVisible(true);
    }
}
