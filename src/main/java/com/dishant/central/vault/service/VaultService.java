package com.dishant.central.vault.service;

public abstract class VaultService<T> {

    public abstract void secure(T t);

    public abstract T fetch();
}