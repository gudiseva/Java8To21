package java8to21;

import java.util.Base64;

public class Base64EncodeDecode {

    public static void main(String[] args) {

        // [1] Plain Text
        String message = "This is a network message";
        String encodedMessage = Base64.getEncoder().encodeToString(message.getBytes());
        System.out.println("Encoded Message: " + encodedMessage);

        byte[] decodedMessage = Base64.getDecoder().decode(encodedMessage);
        String decodedString = new String(decodedMessage);
        System.out.println("Decoded Message: " + decodedString);

        // [2] URL
        String url = "https://www.google.com";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoded Url: " + encodedUrl);

        byte[] decodedUrlBytes = Base64.getUrlDecoder().decode(encodedUrl);
        String decodedUrlString = new String(decodedUrlBytes);
        System.out.println("Decoded Url: " + decodedUrlString);

    }
}
