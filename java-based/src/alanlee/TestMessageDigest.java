package alanlee;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class TestMessageDigest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
        byte[] digestBytes = digest.digest(">4*xBJ6%G8Mp".getBytes(StandardCharsets.UTF_8));
        String pwdDigest = com.sun.org.apache.xml.internal.security.utils.Base64.encode(digestBytes);
        System.out.println(pwdDigest);
    }
}
