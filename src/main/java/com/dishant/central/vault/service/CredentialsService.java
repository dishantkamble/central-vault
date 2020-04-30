package com.dishant.central.vault.service;

import org.springframework.stereotype.Service;
import org.springframework.vault.core.VaultTemplate;

import com.dishant.central.vault.model.Credentials;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CredentialsService extends VaultService<Credentials> {

    private VaultTemplate vaultTemplate;

    @Override
    public void secure(Credentials credentials) {
        this.vaultTemplate.write("book-application/credentials", credentials);
    }

    @Override
    public Credentials fetch() {
        return this.vaultTemplate.read("book-application/credentials", Credentials.class).getData();
    }
}