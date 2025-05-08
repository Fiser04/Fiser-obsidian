# 🧭 Síťové protokoly a porty #

| Vrstva | Zkratka  | Název                                      | Port             | Protokol | Popis                                | Příklad                    |
| ------ | -------- | ------------------------------------------ | ---------------- | -------- | ------------------------------------ | -------------------------- |
| L4     | QUIC     | Quick UDP Internet Connections             | ---              | UDP      | Rychlejší alternativa TCP pro HTTP/3 | YouTube, Chrome            |
| L5     | RADIUS   | Remote Authentication Dial-In User Service | 1812, 1813       | UDP      | Autentizace a účetnictví             | Eduroam                    |
| L5     | DNS      | Domain Name System                         | 53               | UDP      | Překlad domén na IP                  | `example.com -> 192.0.2.1` |
| L5     | DHCP     | Dynamic Host Configuration Protocol        | 67, 68           | UDP      | Automatické přidělení IP adresy      | DORA proces                |
| L5     | HTTP     | HyperText Transfer Protocol                | 80               | TCP      | Webový přenos, nešifrovaný           | Prohlížeče                 |
| L5     | HTTPS    | HTTP Secure                                | 443              | TCP      | Šifrovaný webový přenos (TLS)        | Online bankovnictví        |
| L5     | FTP      | File Transfer Protocol                     | 20, 21           | TCP      | Přenos souborů (nezabezpečený)       | Stahování přes `ftp://`    |
| L5     | SSH      | Secure Shell                               | 22               | TCP      | Šifrované vzdálené připojení         | Správa serveru             |
| L5     | Telnet   | ---                                        | 23               | TCP      | Vzdálený přístup bez šifrování       | Testování portů            |
| L5     | SMTP     | Simple Mail Transfer Protocol              | 25               | TCP      | Odesílání e-mailů                    | Poštovní server            |
| L5     | POP3     | Post Office Protocol v3                    | 110              | TCP      | Stahování e-mailů                    | E-mail klient              |
| L5     | IMAP     | Internet Message Access Protocol           | 143              | TCP      | Přístup k e-mailům na serveru        | Mobilní e-mail             |
| L5     | SMTPs    | Secure SMTP                                | 465              | TCP      | Šifrované odesílání e-mailů          | Gmail                      |
| L5     | IMAPs    | Secure IMAP                                | 993              | TCP      | Šifrovaný přístup k e-mailům         | Outlook                    |
| L5     | POP3s    | Secure POP3                                | 995              | TCP      | Šifrované stahování e-mailů          | Thunderbird                |
| L5     | NTP      | Network Time Protocol                      | 123              | UDP      | Synchronizace času                   | Servery, IoT               |
| L5     | RDP      | Remote Desktop Protocol                    | 3389             | TCP      | Vzdálená plocha (Windows)            | RDP klient                 |
| L5     | HTTP Alt | Alternativní HTTP porty                    | 8080, 8008, 8090 | TCP      | Alternativní HTTP servery            | Vývojové servery           |

# 🔌 IP adresy a významy

| Adresa/Prefix       | Typ  | Význam                       |
| ------------------- | ---- | ---------------------------- |
| 10.0.0.0/8          | IPv4 | Privátní síť                 |
| 172.16.0.0/12       | IPv4 | Privátní síť                 |
| 192.168.0.0/16      | IPv4 | Privátní síť                 |
| 127.0.0.1           | IPv4 | Loopback (localhost)         |
| 0.0.0.0             | IPv4 | Neznámá adresa / výchozí     |
| ::1                 | IPv6 | Loopback                     |
| ::/128              | IPv6 | Neznámá adresa               |
| ::/0                | IPv6 | Default route                |
| FF00::/8            | IPv6 | Multicast                    |
| FC00::/7 – FDFF::/7 | IPv6 | Privátní (unikátní lokální)  |
| fe80::/10           | IPv6 | Link-local                   |
| 2000::/3            | IPv6 | Globálně routovatelné adresy |
| ::ffff:0:0/96       | IPv6 | Mapování IPv4 adres          |
| 169.254.0.0/16      | IPv4 | Link-local (APIPA)           |

# 🧾 Síťové pojmy a poznámky

| Vrstva | Zkratka/Pojem | Název/Význam                                        | Popis                                |
| ------ | ------------- | --------------------------------------------------- | ------------------------------------ |
| L1     | LAN           | Local Area Network                                  | Lokální síť, v rámci budovy          |
| L1     | WAN           | Wide Area Network                                   | Rozsáhlá síť – internet              |
| L1     | MAN           | Metropolitan Area Network                           | Městská síť                          |
| L1     | PAN           | Personal Area Network                               | Osobní síť – např. BT                |
| L1     | UTP           | Unshielded Twisted Pair                             | Nestíněná dvojlinka                  |
| L1     | STP           | Shielded Twisted Pair                               | Stíněné páry v kabelu                |
| L1     | FTP           | Foiled Twisted Pair                                 | Stíněná dvojlinka (folie)            |
| L1     | AWG           | American Wire Gauge                                 | Norma pro tloušťku vodiče            |
| L1     | Cat5e         | Category 5 enhanced                                 | Ethernet kabel (do 1 Gbps)           |
| L1     | 802.3         | Ethernet                                            | Standard pro drátový přenos          |
| L1     | 802.11        | Wi-Fi                                               | Bezdrátový standard                  |
| L1     | 802.1x        | Authentizace                                        | Protokol s Radius serverem           |
| L1     | Dark Fiber    | ---                                                 | Nevyužívané optické vlákno           |
| L1     | Simplex       | ---                                                 | Jednosměrný přenos                   |
| L1     | Half-Duplex   | ---                                                 | Obousměrný, ale ne současně          |
| L1     | Full-Duplex   | ---                                                 | Obousměrný přenos zároveň            |
| L1     | QAM           | Quadrature Amplitude Modulation                     | Modulace pro světlo                  |
| L1     | λ (lambda)    | Vlnová délka                                        | Určuje barvu světla v optice         |
| L1     | FSO           | Free Space Optics                                   | Optická komunikace vzduchem          |
| L2     | MAC           | Media Access Control                                | Adresace na linkové vrstvě           |
| L2     | VLAN          | Virtual LAN                                         | Logické oddělení sítě                |
| L2     | 802.1Q        | VLAN tagging                                        | Identifikace VLAN v rámci rámce      |
| L2     | STP           | Spanning Tree Protocol                              | Zamezuje smyčkám v síti              |
| L2     | LLC           | Logical Link Control                                | Řízení přístupu, multiplexing        |
| L2     | CSMA/CD       | Carrier Sense Multiple Access / Collision Detection | Přístupové řízení u Ethernetu        |
| L2     | Switch        | ---                                                 | Přepíná rámce podle MAC              |
| L2     | Hub           | ---                                                 | Posílá data všem                     |
| L2     | Repeater      | ---                                                 | Zesiluje signál                      |
| L2     | PowerLine     | ---                                                 | Síť přes elektrické vedení           |
| L2     | POE           | Power Over Ethernet                                 | Napájení zařízení přes LAN kabel     |
| L2     | BSSID         | Basic Service Set Identifier                        | MAC adresa AP                        |
| L2     | SSID          | Service Set Identifier                              | Název bezdrátové sítě                |
| L2     | WLC           | Wireless LAN Controller                             | Správa více AP                       |
| L2     | Ad-Hoc        | ---                                                 | Bezdrátová síť bez AP                |
| L2     | MIMO          | Multiple Input Multiple Output                      | Víc datových toků paralelně          |
| L2     | BeamForming   | ---                                                 | Směrování signálu k zařízení         |
| L3     | NAT           | Network Address Translation                         | Překlad mezi vnitřní a veřejnou IP   |
| L3     | PAT/NAPT      | Port Address Translation                            | Překlad více vnitřních na jednu IP   |
| L3     | CIDR          | Classless Inter-Domain Routing                      | Zápis masky (např. /24)              |
| L3     | Anycast       | ---                                                 | Nejbližší server obsluhuje požadavek |
| L3     | SLAAC         | Stateless Address Autoconfiguration                 | Automatická konfigurace bez DHCP     |
| L3     | Link-local    | ---                                                 | Ipv6 adresa pouze pro lokální síť    |
| L3     | DAD           | Duplicate Address Detection                         | Detekce duplicitních IPv6 adres      |
| L3     | EUI-64        | ---                                                 | Odvození IPv6 z MAC adresy           |
| L3     | DNS64         | ---                                                 | Překlad mezi IPv4 a IPv6             |
| L3     | DHCPv6        | ---                                                 | Přidělování IPv6 adres               |
| L4     | TCP           | Transmission Control Protocol                       | Spolehlivý, spojovaný přenos         |
| L4     | UDP           | User Datagram Protocol                              | Nespojený, rychlý přenos             |
| L4     | Handshake     | ---                                                 | Navázání TCP spojení (3-way)         |
| L4     | ACK           | Acknowledgment                                      | Potvrzení přijetí dat                |
| L4     | Flow Control  | ---                                                 | Řízení toku dat                      |
| L4     | QUIC          | ---                                                 | UDP protokol pro HTTP/3              |
| L5+    | Eduroam       | ---                                                 | Vzdělávací Wi-Fi přístup             |
| L5+    | SMTP          | Simple Mail Transfer Protocol                       | Odesílání e-mailů                    |
| L5+    | IMAP          | Internet Message Access Protocol                    | Práce s e-maily na serveru           |
| L5+    | POP3          | Post Office Protocol v3                             | Stažení e-mailů do klienta           |
| L5+    | SNMP          | Simple Network Management Protocol                  | Správa zařízení                      |
| L5+    | TFTP          | Trivial FTP                                         | Jednoduchý přenos souborů            |
| L5+    | CNAME         | Canonical Name                                      | Alias domén                          |
| L5+    | MX            | Mail Exchange                                       | Záznam pro e-mail servery            |
| L5+    | SPF           | Sender Policy Framework                             | Seznam SMTP serverů pro doménu       |
| L5+    | NS            | Name Server                                         | Záznam DNS serverů pro doménu        |
| L5+    | GLUE          | ---                                                 | Zamezení smyčky v DNS                |

