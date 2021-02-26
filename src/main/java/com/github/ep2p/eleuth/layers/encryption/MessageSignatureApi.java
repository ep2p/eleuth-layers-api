package com.github.ep2p.eleuth.layers.encryption;

import com.github.ep2p.eleuth.model.SignedData;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.PublicKey;

public interface MessageSignatureApi {

    class InvalidSignatureException extends Exception {
        public InvalidSignatureException() {
        }
        public InvalidSignatureException(String message) {
            super(message);
        }
        public InvalidSignatureException(String message, Throwable cause) {
            super(message, cause);
        }
        public InvalidSignatureException(Throwable cause) {
            super(cause);
        }
        public InvalidSignatureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
    <E extends Serializable> SignedData<E> signWithCertificate(E input, boolean includePublicKey);
    <E extends Serializable> SignedData<E> signWithCertificate(E input);
    <E extends Serializable> SignedData<E> sign(E input, String privateKey, String publicKey);
    <E extends Serializable> void sign(SignedData<E> unSignedData);
    <E extends Serializable> SignedData<E> sign(E input, PrivateKey privateKey, PublicKey publicKey);
    <E extends Serializable> SignedData<E> sign(E input, boolean includePublicKey);
    <E extends Serializable> void validate(SignedData<E> signedData) throws InvalidSignatureException;
    <E extends Serializable> void validate(SignedData<E> signedData, String publicKey) throws InvalidSignatureException;
    <E extends Serializable> void validate(SignedData<E> signedData, PublicKey publicKey) throws InvalidSignatureException;
    PublicKey getPublicKey(SignedData<?> signedData);
    PublicKey getPublicKey(String encoded);
}
