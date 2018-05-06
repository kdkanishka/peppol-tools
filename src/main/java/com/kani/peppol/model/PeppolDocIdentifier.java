package com.kani.peppol.model;

import no.difi.vefa.peppol.common.model.DocumentTypeIdentifier;

public class PeppolDocIdentifier {
    private DocumentTypeIdentifier documentTypeIdentifier;
    private String docIdentifier;
    private String uri;
    private String peppolId;
    private LookupEnvironmentEnum lookupEnv;

    public PeppolDocIdentifier() {
    }

    public PeppolDocIdentifier(DocumentTypeIdentifier documentTypeIdentifier, String docIdentifier, String uri, String peppolId, LookupEnvironmentEnum lookupEnv) {
        this.documentTypeIdentifier = documentTypeIdentifier;
        this.docIdentifier = docIdentifier;
        this.uri = uri;
        this.peppolId = peppolId;
        this.lookupEnv = lookupEnv;
    }

    public DocumentTypeIdentifier getDocumentTypeIdentifier() {
        return documentTypeIdentifier;
    }

    public String getDocIdentifier() {
        return docIdentifier;
    }

    public String getUri() {
        return uri;
    }

    public String getPeppolId() {
        return peppolId;
    }
    
    @Override
    public String toString() {
        return docIdentifier;
    }

    public LookupEnvironmentEnum getLookupEnv() {
        return lookupEnv;
    }
    
}
