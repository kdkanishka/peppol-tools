package com.kani.peppol.model;

import no.difi.vefa.peppol.common.model.Endpoint;

public class PeppolEndpoint {

    private Endpoint endpoint;
    private String transportProfile;
    private String url;

    public PeppolEndpoint(Endpoint endpoint, String transportProfile, String url) {
        this.endpoint = endpoint;
        this.transportProfile = transportProfile;
        this.url = url;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public String getTransportProfile() {
        return transportProfile;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return transportProfile;
    }

}
