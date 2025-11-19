# Zefektivneni vyvoje pozemniho bojoveho vozidla

## "uvodni strana"

## Uvod
Semestralni prace se zabyva vyvojem noveho systemu ktery zefektivni vyvoj pozemniho vozidla.

Zadavatel dne x zaslal objednavku pro nove pozemni bojove vozidlo schopne dominovat moderni bojiste a modernizovat vybavu armady. V objednavce specifikoval ruzne pozadavky na vozidlo, zejmena typ, ochrana osadky, mobilitu, vyzbroj a jednoduchost udrzby tak i opravy.

Specifikace objednavky:
Typ: Tank
Ochrana: Aktivni i pasivni ochrana proti vsem modernim ryzikum (drony, navadene strely, atd.)
Mobilita: Prevazne pevny rovny povrch, s obcasnym rozmocenym povrchem, v idealnich podminkach alespon 60 km/h
Vyzbroj: Zvysit prubojnost hlavniho dela, 2 x kulomet (koax, na vezi), stabilizator, automaticky nabijec, laserovy meric vzdalenosti
Udrzby a opravy: Tank musi byt jednoduchy na udrzbu a opravy v terenu

Po dokonceni takto rozsahle objednavky jsme se rozhodli o zavedeni noveho systemu pro vyvoj a testovani potencionalnich hrozeb pomoci simulaci, ktery nam pomuze eliminovat nedostatky jeste pred fazi prototypu, ktera je draha a casove narocna.

Cilove pozadavky od systemu
Centralni sledovani plneni pozadavku
Ovladat digitalni podobu (3d model s parametry)
Provadet pokrocile simulace na digitalni podobe (balisticke (in, out), mobilita, udrzitelnost(my summer car))
Zaznamenavat historii zmen

## Logicky ramec

| Popis projektu                                                                                                                                                                                                                                                   | Objektivne overitelne ukazatele                                                                                                                                                                                                                                                     | Prostredky overeni                                                                                                                                                                        | Predpoklady                                                                                     |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| Cil projektu:<br>Vcas postavit finalni prototyp pro predstaveni zadavateli                                                                                                                                                                                       | Porovnani datumu ocekavaneho splneni zadani a datumu vytvoreni prototypu pro predstaveni                                                                                                                                                                                            | Dokument zadani<br>Dokument o predstaveni prototypu                                                                                                                                       |                                                                                                 |
| Ucel:<br>Zefektivnit vyvoj vojenske techniky                                                                                                                                                                                                                     | 30% snizeni doby potrebne na predstaveni prototypu<br>40% snizeni nakladu pro stavbu prototypu                                                                                                                                                                                      | Porovnani s predeslymi projekty                                                                                                                                                           | Aktivni vyuziti systemu                                                                         |
| Vystupy:<br>Funkcni informacni system<br>Knihovna simulaci<br>Dokumentace a proskoleny uzivatelsky team                                                                                                                                                          | System prosel testovanim a byl nasazen<br>Knihovna obsahuje 100% zakladnich simulacnich scenarii<br>Dokumentace je zhotovena<br>Uzivatele jsou proskoleni                                                                                                                           | Protokol o proskoleni<br>Protokol o uspesnem testovanim<br>Protokol o nasazeni<br>Katalog scenaru simulaci<br>Dokumentace                                                                 | Dostupny hardware, team vyvojaru a team lidi na simulace                                        |
| Cinnosti:<br>Sestaveni teamu<br>Detailni analyza vyvojoveho procesu<br>Zajisteni/Nakup potrebnych nastroju/infrastruktury<br>Navrh a vyvoj systemu<br>Tvorba simulacnich modelu a scenaru<br>Testovani systemu<br>Vypracovani dokumentace a proskoleni uzivatelu | Tym je sestaveny<br>Analyza je dokoncena<br>Vsechny potreby jsou zajistene<br>System je navrhnut<br>System je vyvynut<br>Modely jsou vytvoreny<br>Scenare jsou vytvoreny<br>System byl uspesne otestovan<br>Dokumentace byla vytvorena a schvalena<br>Uzivatele byli proskoleni<br> | Organizacni plan<br>Protokol o analyze<br>Zkontrolovany list potreb<br>Protokol o vyvoji<br>Protokol o modelech a scenaru<br>Protokol o testovani<br>Dokumentace<br>Protokol o proskoleni | Spoluprace mezi tymy<br>Dostatek odborniku pri navrhu systemu a vytvareni simulaci a modelu<br> |
![[Untitled.jpg]]