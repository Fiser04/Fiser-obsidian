import java.net.*;
import java.util.*;

public class PortScanner {
    
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java PortScanner <host> [startPort-endPort]");
            System.out.println("Example: java PortScanner 192.168.1.1 20-100");
            return;
        }
        
        String host = args[0];
        int startPort = 1;
        int endPort = 1024; // Scan common ports by default
        
        // Parse port range if provided
        if (args.length > 1 && args[1].contains("-")) {
            String[] ports = args[1].split("-");
            startPort = Integer.parseInt(ports[0]);
            endPort = Integer.parseInt(ports[1]);
        }
        
        System.out.println("Scanning " + host + " from port " + startPort + " to " + endPort);
        scanPorts(host, startPort, endPort);
    }
    
    public static void scanPorts(String host, int startPort, int endPort) {
        List<Integer> openPorts = new ArrayList<>();
        
        for (int port = startPort; port <= endPort; port++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), 1000); // 1 second timeout
                openPorts.add(port);
                System.out.println("Port " + port + " is OPEN");
            } catch (Exception e) {
                // Port is closed or filtered
                System.out.println("Port " + port + " is closed");
            }
        }
        
        System.out.println("\nScan complete!");
        System.out.println("Open ports: " + openPorts);
    }
}
