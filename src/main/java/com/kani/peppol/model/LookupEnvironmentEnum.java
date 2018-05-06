/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kani.peppol.model;

/**
 *
 * @author kanishka
 */
public enum LookupEnvironmentEnum {
    PROD("PROD"),
    TEST("PROD");

    private String env;

    LookupEnvironmentEnum(String env) {
        this.env = env;
    }

    public String env() {
        return env;
    }
}
