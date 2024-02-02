//import java.net.*;
//import java.io.*;
//import javax.print.DocFlavor.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

public class _46_Network_3 {
    public static void main(String[] args) {
        String urlString = "https://en.wikipedia.org/wiki/Java_(programming_language)";
        try {
            URI uri = new URI(urlString);
            URL url = uri.toURL();
            // Using try-with-resources to automatically close the InputStream and BufferedReader
            try (InputStream is = url.openStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr)
                )
                {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (URISyntaxException e) {
            System.err.println("Invalid URI syntax: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the content: " + e.getMessage());
        }
    }
}
