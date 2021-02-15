package com.github.ep2p.eleuth.layers.encryption;

import java.security.KeyStore;

public interface KeyStoreFileApi {
    KeyStore generateKeyStore();
    boolean exists();
    String getKeystoreAddress();
}
