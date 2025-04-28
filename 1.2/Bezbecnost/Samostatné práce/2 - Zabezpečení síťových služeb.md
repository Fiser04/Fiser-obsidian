Síťové služby jsou služby spuštěné na počítači a naslouchající na síťovém rozhraní. Jsou charakterizované číslem portu (např. WEB server 80, ssh 22, telnet 23, ssh 22 apod).

Zjistěte jaký je rozdíl mezi portem a socketem a vypište síťové služby naslouchající na Vašem počítači. O jaké služby se jedná a na jakých portech naslouchají (nápoveda: netstat)?
	- port - ciselne oznaceni ciste te sluzby (53 - DNS)
	- socket - ip + port + protokol (192.168.122.1:53/tcp)
	- `ss -a | grep LISTEN`	![[Pasted image 20250416171507.png]]


Bezpečnost počítače/serveru lze zvýšit, když vypneme nepotřebné služby. Uveďte postup, jak vypínat/zapínat služby na Vašem počítači.
	- `kill`
	- `pkill`
	- `sudo systemctl stop sluzba`
	- `sudo systemctl disable sluzba`


Některé služby jsou historicky považované za více rizikové, pokuste se uvést některé příklady.
	- telnet
	- ftp
	- smb (pri spatne konfiguraci)
	- nejake webove servery (apache)


Co to je firewall a k čemu slouží?
	- takovy bod pres kterou jde vsechna komunikace mezi sitemi, slouzi jako kontrola/aplikator jeho pravidel
	- nastavim firewall tak aby na me nikdo z netu nemohl ale ja do netu ano


Jaký je rozdíl mezi stavovým a bezstavovým firewallem (filtrem)?
	- stavovy firewall 
		- je schopny sledovat vse co se v provozu deje, filtruji tudiz na zaklade provozu (dynamicke filtrovani)
	- nestatovy
		- kontroluje provoz na zaklade klicovych hodnot (ip adresy, porty, atd.) a porovnava je s tabulkou pravidel


Co to je aplikační firewall?
	- webovy aplikacni firewall
	- sleduje pozadavky a odpovedi webove stranky a hleda ty skodlive, pak to zablokuje a da je na cernou listinu
	- kdyz treba dam pozadavek ve stylu login, admin, pass 1234, tak veme tento pozadavek a zablokuje jej, zbytek propusti


Síťové služby musí být udržovány aktuální, protože se v nich často objevují chyby, které může útočník zneužít (viz. databáze chyb, o které jsme mluvili na úvodních přednáškách). Jak je zajišťována aktuálnost služeb?
	- castemi aktualizacemi
	- pouzit ruzne zaplaty *kdyz mam nejakej nastroj kterej vim ze je tam nejaka chyba ale existuje zaplata tak ji pouziju*


viz body 1 a 2 výše plus: Jak je realizován firewall na zařízení které používáte?
	- pomoci gufw (Uncomplicated Firewall)
	- Profile: Public
	- Incoming: Reject
	- Outgoing: Allow
	![[Pasted image 20250416181805.png]]


Jak byste na svém firewallu nastavili blokování všech požadavků o spojení na služby přicházejících ze sítě, kromě požadavků přicházejících na WEB server (TCP porty 80 a 443)?
	- pridal bych pravidla (rules) pro tyto porty
	- `sudo ufw allow 80/tcp`
	- `sudo ufw allow 443/tcp`
	/nebo graficky ![[Pasted image 20250416182307.png]]


Uveďte příklady aplikačních firewallů.
	- ModSecurity
	- Iron Bee
	- F5


Vyberte si jednu, nebo více síťových služeb běžících na Vašem počítači (pokud nemáte počítač, nebo na něm žádná síťová služba neběží, tak libovolnou službu, která Vás napadne) a najděte v databázi chyb nedostatky této služby za poslední rok.
	- openSSH
	- https://nvd.nist.gov/vuln/detail/CVE-2025-27731
	- Improper input validation in OpenSSH for Windows allows an authorized attacker to elevate privileges locally.
	- 8.4.2025


Popište, jak zajišťujete aktualizaci služeb na svém počítači/telefonu a jak se nastavuje.
	- `sudo apt update && sudo apt upgrade`
	- `flatpak update`