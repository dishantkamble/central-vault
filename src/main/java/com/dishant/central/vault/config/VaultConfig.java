package com.dishant.central.vault.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

@Configuration
public class VaultConfig extends AbstractVaultConfiguration {

    @Override
    public VaultEndpoint vaultEndpoint() {
        return VaultEndpoint.create("host", 8020);
    }

    @Override
    public ClientAuthentication clientAuthentication() {
        return new TokenAuthentication("00000000-0000-0000-0000-000000000000");
    }
}