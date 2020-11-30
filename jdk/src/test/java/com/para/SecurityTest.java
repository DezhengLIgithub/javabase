package com.para;

import org.junit.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertPath;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Map;

public class SecurityTest {


    @Test
    public void  getProviders() {
        for(Provider provider : Security.getProviders()) {
            System.out.println(provider);
            for(Map.Entry<Object, Object> entry : provider.entrySet()) {
                System.out.println("\t" + entry.getKey());
            }
        }
    }


    @Test
    public void testMd5() throws NoSuchAlgorithmException, IOException {
        byte[] input = "md5".getBytes();

        MessageDigest md = MessageDigest.getInstance("MD5");

        DigestInputStream dis = new DigestInputStream(new ByteArrayInputStream(input), md);

        dis.read(input, 0, input.length);

        byte[] output = dis.getMessageDigest().digest();

        System.out.println(output);

        dis.close();

    }



    @Test
    public void testTimeStamp() throws CertificateException, FileNotFoundException {
        CertificateFactory cf = CertificateFactory.getInstance("X509");

        CertPath cp = cf.generateCertPath(new FileInputStream("D:\\git-workspace\\javabase\\jdk\\src\\test\\cert\\ccc.cer"));

        Timestamp t = new Timestamp(new Date(), cp);

    }


    @Test
    public void testKeyGenerator() throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("HmacMD5");
        generator.init(32);
        SecretKey key = generator.generateKey();

        System.out.println(key.getEncoded());
    }





















}
