Pokud útočník získá fyzický přístup k výpočetní technice, nebo infrastruktuře, může odcizit disky s daty, celé počítače, nebo může do infrastruktury instalovat vlastní zařízení pomocí kterých může kompromitovat data přenášená v rámci infrastruktury, nebo útočit na další zařízení v infrastruktuře.
Mezi opatření fyzické bezpečnosti patří
	• ochrana systémů před krádeží, připojením periferií, rozebráním, nebo úpravou
	• kontrola fyzického přístupu osob
	• zabezpečení perimetru
	• vnitřní bezpečnost

Jaké existují metody pro chranu systémů před krádeží, připojením periferií, rozebráním, nebo úpravou?
	- alarm (detekce pohybu)
	- kamerovy system
	- v biosu zamknout preriferie
	- zaslepky
	- nejake sebedestrukcni zarizeni
	- kontrolovane logy


Jaké mechanizmy se používají ke kontrole fyzického přístupu osob do budovy, nebo na počítačový sál?
	- pristupova karta
	- alarm, ktery musi deaktivovat prvni prichodzi a aktivovat posledni
	- vratny


Co rozumíme perimetrem a jakými prostředky ho můžeme monitorovat?
	- prostory a okoli toho co se snazime ochranit


d) Jaká existují opatření pro zajištění vnitřní bezpečnosti?
Literatura: Kolouch, Bašta Cybersecurity (https://knihy.nic.cz/media/filer_public/e3/6a/e36aa45e-4885-4d5e-a9ec-4333ff35615c/cybersecurity.pdf)

Ověření zabezpečení
Ověření zabezpečení má za úkol ověřit, zda jsou správně nasazena všechna relevantní opatřní (controls).
Mezi základní způsoby ověření patří:
- ověření zabezpečení zevnitř operačního systému (z pohledu správce systému) - whitebox
- sken zranitelností (vulnerability scan)
- penetrační test – blackbox


Alespoň orientačně se seznamte s následujícími metodikami ověření zabezpečení zevnitř systému:
CIS Benchmarks (https://www.cisecurity.org/)
SCAP (https://www.open-scap.org/)


Uveďte alespoň dva nástroje, které slouží k automatizovanému skenu zranitelností.
	- OpenVAS (Open Vulnerability Assessment System)
	- Nessus


Co to je penetrační test?
	- testy vytvorene bezpecakem a zkousi zda je vse v poradku a ze nepronikne jen tak
	- defakto simulovany utok
		- dalo by se rici vseho
		- resi se od fyzicke bezpecnosti az po treba SQL injection


Orientačně se seznamte s následujícími metodikami používanými při penetračních testech:
OSSTMM (http://www.isecom.org/research/)
PTES (http://www.pentest-standard.org/)
OWASP Testing guide (https://www.owasp.org/index.php/OWASP_Testing_Project)