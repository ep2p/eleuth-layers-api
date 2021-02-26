package com.github.ep2p.eleuth.layers.encryption;

import lombok.*;

import java.security.KeyPair;
import java.util.List;

public interface RingKeyGenerateApi {
    RingKey generate();

    @Builder
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    class RingKey {
        private List<String> ids;
        private List<KeyPair> keyPairs;
        private String key;
    }
}
