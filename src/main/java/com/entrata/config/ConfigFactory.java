package com.entrata.config;

public final class ConfigFactory {

    public static FrameworkConfig getConfig() {
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
