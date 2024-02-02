//import java.net.*;
//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class _47_Network_4 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.google.com", 80);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            // Send HTTP GET request
            writer.println("GET / HTTP/1.1");
            writer.println("Host: www.google.com");
            writer.println();
            // Read and print the response
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
            // Close the socket
            socket.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
