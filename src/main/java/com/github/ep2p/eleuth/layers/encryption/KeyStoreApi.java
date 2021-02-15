package com.github.ep2p.eleuth.layers.encryption;

import java.io.IOException;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Map;

public interface KeyStoreApi {
    void addCertificate(Certificate certificate, String userId) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException;
    void deleteCertificate(String userId) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException;
    Certificate getEncodedCertificate(String base64) throws CertificateException;
    Certificate getCertificate(byte[] bytes) throws CertificateException;
    void addCertificate(String base64, String userId) throws IOException, CertificateException, KeyStoreException, NoSuchAlgorithmException;
    void addCertificate(byte[] bytes, String userId) throws CertificateException, KeyStoreException, IOException, NoSuchAlgorithmException;
    Certificate getCertificate(String alias) throws KeyStoreException;
    List<Certificate> getCertificatesList() throws KeyStoreException;
    Map<String, Certificate> getCertificatesMap() throws KeyStoreException;
    KeyStore getKeyStore();
    String getPublicKeyHash();
    KeyPair getMainKeyPair() throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException;
}
