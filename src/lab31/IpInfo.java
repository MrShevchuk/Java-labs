package lab31;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class IpInfo {

    public static void main(String[] args) throws Exception {


        URL url = new URL("https://api.2ip.ua/geo.json");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("Host: " + url.getHost());
        System.out.println("Ext: " + url.toExternalForm());

        int c;
        URLConnection httpURLConnection = url.openConnection();
        httpURLConnection.connect();
        System.out.println("Date: " + httpURLConnection.getDate());
        System.out.println("Type: " + httpURLConnection.getContentType());
        System.out.println("Exp: " + httpURLConnection.getExpiration());
        System.out.println("Last Modify: " + LocalDateTime
                .ofEpochSecond(httpURLConnection.getLastModified(), 0, ZoneOffset.UTC));
        System.out.println("Lenght: " + httpURLConnection.getContentLength());

        if (httpURLConnection.getContentLength() > 0) {
            System.out.println("=== Content ===");
            try (InputStream input = httpURLConnection.getInputStream()) {
                int i = httpURLConnection.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                }
            }
        } else {
            System.out.println("No Content Available");
        }
    }
}
