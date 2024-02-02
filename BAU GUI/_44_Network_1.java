import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class _44_Network_1 {
    public static void main(String[] args) {

        Desktop desktop = Desktop.getDesktop();
        try {
            URI uri = new URI("https://www.google.com"); // Include the protocol (https://)
            desktop.browse(uri);
        } catch (IOException | URISyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
