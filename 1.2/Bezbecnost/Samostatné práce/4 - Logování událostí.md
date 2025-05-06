[[5) Logovani a auditing - 14.4.2025]]

Logování událostí v operačním systému je základním opatřením, které slouží mimo jiné k detekci
bezpečnostních událostí, nebo k jejich následné analýze.

Jaké bezpečnostní události je vhodné logovat? Pokuste se dohledat minimální doporučenou sadu událostí. Pokuste se doplnit události související s již nastudovanou problematikou.
	- authentizace uzivatele
	- sprava uzivatelu (prava atd.)
	- zmena nastaveni systemu (firewall, antivir, atd.)
	- neautorizovany pokus o cteni/zapis dat
	- sitove udalosti (sken portu, nove zarizeni, apod.)
	- antivirus (kdyz najde neco skodliveho)
	- Intrusion Detection and Intrusion Prevention Systems.
	- VPN


Logování nastavujeme na jednotlivých serverech, osobních počítačích a dalších zařízeních (firewally, síťové prvky, aplikace atd.). Jak je vhodné realizovat systém logování ve velké organizaci?
	- mit centralni system do ktereho se budou posilat vsechny logs


Co to je SIEM?
	- Security Information and Event Management
	- centralizovany system logu
	- schopny vizualizace
	- detekuje hrozby v realnem case
	- provadi korelaci *neboli spojuje udalosti a kontroluje jestli jsou pospolu bezpecnostni incident*


Nastavte na svém počítači logování neúspěšných pokusů o přihlášení (pokud již nastaveno není) a proveďte jeden neůspěšný pokus o přihlášení. Najděte log, ve kterém bude tato událost zaznamenána.
	- `sudo dump-utmp /var/log/btmp`
	- fiser   |tty7  |7|:0  |114157|:0                       |Sat Apr 19 13:06:17 2025


Šifrování a integrita souborů
Šifrujeme minimálně na dvou úrovních. Na úrovni souborového systému (celé disky, souborové systémy, nebo jednolivé soubory) a na úrovni síťové komunikace (pokud přenášime data skrze nedůvěryhodnou síť, kde hrozí jejich odposlech – narušení důvěrnosti a integrity).

Uveďte příklady software, pro šifrování disků (souborových systémů) a jednotlivých souborů pro operační systémy Windows a Linux.
	- Windowns
		- bitlocker (cely disk)
		- Encrypting File System (EFS)
	- Linux
		- Linux Unified Key Setup (LUKS) (cely disk)
		- GNU Privacy Guard (gpg) 


Jak je šifrována komunikace s WEB serverem?
	- prohlizec pozada o certifikat
	- certifikat je overen a pak zasle prohlizec svuj klic a komunikace bezi


Co to je soukromý a veřejný klíč a k čemu každý z nich slouží?
	- verejny
		- ten kdo ho ma tak mi muze poslat zasifrovanou zpravu
	- soukromy
		- ten tuto zpravu zase rozzsifruje
		- musim ho chranit


Co to je certifikát?
	- je to jakoby obcanka weboveho serveru
	- prokazuje se ze je pravy a bezpecny


Uveďte některé protokoly, které se používají při šifrování pomocí HTTPS, které z nich jsou doporučované a které zastaralé?
	- nyni TLS 1.3 a 1.2
	- zastarale jsou SSL a stare verze TLS


Uveďte některé šifrovací algoritmy a hashe, které se v protokolech z otázky 5 používají. Které z nich jsou zastaralé a nedoporučují se používat?
	- Šifra
		- AES-GCM, ChaCha20 (doporucene)
		- RC4, 3DES, DES (zastarale)
	- Hash 
		- SHA-256, SHA-384 (doporucene)
		- SHA-1, MD5 (zastarale)
	- Key Exchange 
		- ECDHE, DHE (doporucene)
		- Statický DH, RSA-only handshake (zastarale)


Pomocí jakého programu budete bezpečně vzdáleně přistupovat k terminálu Linux serveru a Windows serveru?
	- open SSH, putty


Dokázaji byste najít software, který zajišťuje integritu souborů, nebo alespoň informuje o její narušení? Tzn. Informuje o tom, když je změněn obsah sledovaného souboru?
	- tripwire
		- vytvori hash souboru a pak jej porovnava


Jaké soubory je vhodné sledovat?
	- configs systemu
	- binarku (/usr/bin)
	- /etc/passwd


Zašifrujte jeden testovací soubor na Vašem počítači.
	- `gpg --symmetric tajne.txt`
	- `gpg --output tajne-decrypted.txt --decrypt tajne.txt.gpg`![[tajne.txt.gpg]]	![[tajne.txt]]


Vyexportujte certifikát serveru elearning.jcu.cz. Pro jaký server byl vydán a kdo ho vydal?
	- eknihovna.jcu.cz
	- Let's Encrypt