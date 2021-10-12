package Tasks;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Task16_23 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(1);
        
        InputStream inputStream = connection.getInputStream();
        byte[] buffer = inputStream.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}