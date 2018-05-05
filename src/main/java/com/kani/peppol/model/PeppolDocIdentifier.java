package com.kani.peppol.model;

public class PeppolDocIdentifier {
    private String docIdentifier;
    private String uri;

    public PeppolDocIdentifier() {
    }

    public PeppolDocIdentifier(String docIdentifier, String uri) {
        this.docIdentifier = docIdentifier;
        this.uri = uri;
    }

    public String getDocIdentifier() {
        return docIdentifier;
    }

    public void setDocIdentifier(String docIdentifier) {
        this.docIdentifier = docIdentifier;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return docIdentifier;
    }
}
