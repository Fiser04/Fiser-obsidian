### O webech
- symetricke sifrovani
	- stejny klic pro zasifrovani a odsifrovani
	- vyhoda
		- rychlost
	- nevyhoda
		- pokud se nekdo dostane k klici tak ten co odposlouchava komunikaci tak ji ma odsifrovanou
	- priklady
		- DES
		- Triple DES
		- Cezarova sifra
- asymetricke sifrovani
	- vygeneruju 2 klice
		- verejny a soukromy
	- zasifrovavam verejnym klicem toho druheho, on si to odsifruje svym soukromym
	- priklady
		- RSA

- sslstrip

- existuji weby ke kterem se pripojuji pres http a se pojede na 443, ALE to se muze dit treba jen jednou na prvnim zobrazeni, co mohu udelat je bejt man in the middle a kdyz se bude chtit dostat treba na login tak zmenim odkaz v html z https na html, on tam neco napise a ja si to zobrazim protoze to posila nesifrovane

### O apr
- arp protokol
	- zjistuji mac adresu podle ip adresy
	1) vygeneruju arp request
		1) ip4 svoje
		2) ip4 jeho
		3) mac moje
		4) mac broadcast
	2) ten pro koho to je vygeneruje arp reply
		1) ip4 svoje (toho odpovidajiciho)
		2) ipv4 jeho (ten co se ptal)
		3) mac moje (toho odpovidajiciho)
		4) mac jeho (ten co se ptal)
	- ARP cache
		- cache kterou ma kazde sitove rozhrani
			- localhost
			- ethernet
			- wlan
		- IP | MAC
	- zaznamy jsou dynamicke (treba po x minutach, pul hodine), pak se znovu overuji

### Odposlech
- *jsem vsemocny*
	- mohu predelat arp cache cizich pc
	- ethercap-ng (program v kali)
	- ![[Pasted image 20251204165441.png]]
	- A
		- IP B | MAC MIM
	- B
		- IP A | MAC MIM
	- MIM
		- IP A | MAC A
		- IP B | MAC B
- pridam si svuj router kterej bude *znat* urcitou sitovou adresu a chytrej router hned rekne