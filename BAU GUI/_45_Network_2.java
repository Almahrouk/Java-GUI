//import java.net.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class _45_Network_2 {
    public static void main(String[] params) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            InetAddress thisIp = InetAddress.getLocalHost();

            // Output: www.google.com/142.250.186.36
            System.out.println(address.getHostName() + "  " + address.getHostAddress());

            // Output your computer IP and Name
            System.out.println("IP: " + thisIp.getHostAddress());
            System.out.println("NAME: " + thisIp.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
www.google.com  142.251.143.100
IP: 192.168.100.17
NAME: Almahrouk
*/
