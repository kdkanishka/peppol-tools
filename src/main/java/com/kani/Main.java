package com.kani;

import com.kani.ui.PeppolToolUI;
import no.difi.vefa.peppol.common.lang.EndpointNotFoundException;
import no.difi.vefa.peppol.common.lang.PeppolLoadingException;
import no.difi.vefa.peppol.lookup.api.LookupException;
import no.difi.vefa.peppol.security.lang.PeppolSecurityException;

/**
 * https://github.com/difi/vefa-peppol/tree/master/peppol-lookup
 */

public class Main {
    public static void main(String[] args) throws PeppolLoadingException, LookupException, EndpointNotFoundException, PeppolSecurityException {
        try {
            javax.swing.UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch(Exception ignored){}

        PeppolToolUI peppolToolUI = new PeppolToolUI();
        peppolToolUI.setVisible(true);
    }
}
