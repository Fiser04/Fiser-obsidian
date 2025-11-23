# Configurator bojoveho vozidla
---
## Uvod
Tato semestralni prace se zabyva vytvoreni configuratoru, ktery bude nabizet.
to-do (myslenka):
Takze musim vytvorit system, ktery dovoli zakaznikovi "nakonfigurovat" si vlastni bojove vozidlo, ktery si pak bude moci objednat, neboli neznamy uzivatel se prihlasi, system mu nacte po overeni konfigurator kde nejdrive zada pozadovany pocet kusu, ten bude mit 2 mody, rychly (zobrazi konfigurace ktera jsou jiz ve vyrobe s moznosti malych zmen (jiny model visilacky, apod)) a pomaly (vlastni konfigurace), system bude nabizet jen kompatibilni dily podle vyberu (takze nenarvu vez z tigra na pz 1 (jen predstava)), po konfiguraci bude zakaznik preveden na potvrzeni konfigurace a poctu kusu, pak mu bude zobrazena smlouva s predpokladanou (cisty nastrel) dobou dodani (jen typove, treba 8-9 mesicu), pak probehne vyber platby, pak platba, objednavka je vytvorena, system automaticky zkontroluje jestli ma ve sklade dost neprirazenych dilu, pokud ne, zasle objednavku na dily dodavatelum.
1. neznamy uzivatel se bude muset umet prihlasit
2. prihlaseny uzivatel (dale jen zakaznik) bude moci pouzivat configurator
3. configurator bude nabizet bud jiz jedouci objednavky a nebo vlastni konfiguraci, ktera bude zobrazovat jen kompatibilni dily
4. automaticky to bude vytvaret cenu za kus
5. zakaznik vybere pocet vozidel
6. system vytvori smlouvu a da ji potvrdit zakaznikovi
7. pak se objednavka bud zahazuje nebo posila dal podle potvrzeni zakaznika a podle platby
8. system udela kopii objednavky na kusovniku 
9. system zkontroluje pocet neprirazenych potrebnych dilu na skladu podle kusovniku
10. doobjedna vsechny potrebne dily
11. po doruceni vsech dilu zasila objednavku vedoucimu vyroby
12. vedouci vytvori vyrobni plan a da jej do systemu
13. system zasle podle planu ocekavanou dobu pro vyrobu
14. po dokonceni vyroby, vedouci udela protokol o vyrobe objednavky, ktery zada do systemu
15. prijde team testeru, ktery pomoci systemu zkontroluje produkt (radio - funguje/nefunguje)
16. po dokonceni uspesnych testu zakaznikovi system posle adresu, kam ma napsat pro domluveni vyzvednuti objednavky

## Logicky ramec

| Popis projektu                                                                                                                                                                            | Objektivne overitelne ukazatele                                                                                                                                                                           | Prostredky overeni                                                                                                                                   | Predpoklady                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| Cil projektu<br>Zefektivneni celeho procesu zacinajici od zadani zakazky az po testovani.                                                                                                 | Snizeni doby zpracovani objednavky o 40% oproti manualni objednavanim pres obchodni oddeleni.<br>Snizeni chybovosti pri vytvareni objednavky na 0.5%.<br>Zvyseni spokojenosti zakazniku o alespon 20%<br> | Report z systemu (prumerna doba zpracovani objednavek).<br>Reporty o reklamaci zpusobene chybnou konfiguraci.<br>Recenze a dotazniky o spokojenosti. |                                                                                             |
| Ucel projektu<br>Zavest novy system, ktery zamezi chybam pri konfiguraci a propoji vsechny systemy do jednoho.                                                                            | Odstraneni potreby preposilani objednavek z oddeleni na druhe.                                                                                                                                            | Pocet poslanych emailu z mail serveru.                                                                                                               | Zakaznici a zamestnanci jsou ochotni system pouzivat.<br>                                   |
| Vystupy<br>Funkcni implementovany system obsahujici konfigurator, backend, integrace znamych dodavatelskych systemu, logovani.                                                            | Konfigurator s UI pro zakazniky vcetne prihlaseni.<br>Modul pro spravu kompatibility dilu.<br>Modul pro sklad, vyrobu a testovani.<br>Komunikacni modul (emaily).                                         | Funkcni demonstrace systemu.<br>Dokumentace modulu a navody pro pouziti.<br>Reporty                                                                  | Znaly team vyvojaru pro vytvoreni systemu.<br>Znaly team techniku pro spravu kompatibility. |
| Cinnosti<br>Analyza pozadavku na system.<br>Slozit team.<br>Navrh modelu.<br>Zajistit potrebne zdroje.<br>Vyvoj samotneho systemu.<br>Testovani systemu.<br>Proskoleni vsech zamestnancu. | Financni zdroje                                                                                                                                                                                           | 4 tydny<br>2 tydny<br>4 tydny<br>2 tydny<br>12 tydnu<br>6 tydnu<br>4 tydny                                                                           | Dostatecny rozpocet.<br>Schopne zamestnance.<br>Podora vedenim.<br>                         |

## Rizika
co, jaka je sance, dopad, oprava
- Nizka podpora vedeni
	- 1
	- 5 (system nebude)
	- Skvela odprezentace projektu vedeni.
- nepovedena integrace systemu
	- 2
	- 5 (system nesplnuje cast sveho zadani)
	- Postupna integrace systemu (postupne nahrazovani)
	- Vyvoj systemu tak aby byl zpetne kompatibilni
- nekompatibilni nabidky pri konfiguraci
	- 2
	- 4 (muze vzniknout nesmyslna objednavka a prijde se na ni az pri vyrobe)
	- pravidelna aktualizace kompatibilit teamem techniku
	- manualni schvalovani nestandartnich objednavek
- zakaznik nepochopi ui
	- 3
	- 5 (zakaznik si nebude moci u nas objednat)
	- Pridat navod na obsluhu ui
- odpor zamestnancu ke zmene systemu
	- 4
	- 4 (neochota presunu, system nebude vyuzit)
	- Spravne a dukladne proskoleni
	- Support po nasazeni
	- Propagace systemu ("diky tomuto systemu nemusite rozesilat tolik emailu)
- nepovedene skoleni
	- 3
	- 4-5 (zamestnanci neumi pouzivat system spravne)
	- Ozkouset znalost systemu skolitelu
- vytvoreni chybne smlouvy
	- 2
	- 5 (mozne velke penezni ztraty, az odneti svobody)
	- System bude cerpat z predlohy od pravniku
- prekroceni terminu
	- 3
	- 4 (bude se pouzivat nadale stary system, ale je to furt velky problem)
	- Pravidelne revize milniku
	- Mit rezervu 10%
- prekroceni rozpoctu
	- 3
	- 4
	- Sledovat prubezne naklady
	- Mit rezervu 15%
	- Pravidelne financni reporty
- vypadek meho systemu
	- 2
	- 5 (zastaveni nove vyroby a testu)
	- Mit zalozni bezici system
- vypadek integrace dalsich systemu
	- 2
	- 4
	- Fronta objednavek
- chyby v objednavkovem procesu
	- 3
	- 4 (financni ztraty)
	- automaticke validace objednavek
	- manualni schvalovani nestandartnich objednavek
- zakaznik si nevybere potrebny dil
	- 3
	- 5 (do vyroby by sel pozadavek na nefunkcni bojove vozidlo)
	- Urcit v UI jake polozky jsou povinne
- dodavatel prestal vyrabet potrebny dil
	- 2
	- 5
	- Casto aktualizovana databaze moznych dilu pro konfiguraci
	- Zkontaktovat zakaznika, nabidnout alternativu (z radia x na radio y)
- zakaznik po potvrzeni smlouvy nezaplati
	- 2
	- 5
	- Ve smlouve bude doba pro zaplaceni, pokud nebude zaplaceno, zanika
- vyrobene vozidlo neprojde testy
	- 3
	- 5 (vozidlo neni mozne oznacit jako uspesne otestovano)
	- Vozidlo pujde zpet na vyrobu kde opravi/vymeni nefunkcni dil
- zakaznik se rozhodne stornovat/pozmenit objednavku
	- 2
	- 5 (vozidla nebudou podle predstav zakaznika)
	- Manualni zmena v systemu pro tu jednu objednavku, pri stormu mozne odstraneni
	- Pokud stornovani/zmena prijde po dodani vsech dilu/ dodani potrebnych dilu pro nechtene casti zakaznik bude musi zaplatit.
	- Pri stornaci pred dodani dilu, nic neplati.
	- Pri stornaci pro vyrobe, tak zakaznikovi nebudou vraceny penize a vozidla budou rozebrany a pouzity do jinych objednavek
- neaktualizovana data v databazi skladu
	- 3
	- 5 (objednani nepotrebnych dilu/nedostatecny pocet dilu potrebne na vyrobu)
	- Skladovy personal bude do systemu zaznamenavat kazdou zmenu
- bezpecnostni ryzika
	- 2
	- 5 (unik dat, neopravnena manipulace s systemem, ...)
	- System roli, sifrovana komunikace a dalsi bezpecnostni reseni
- zneuziti configuratoru
	- 2
	- 5 (neplatne/falesne zakazky, apod.)
	- logovani vsech uzivatelskych akci a skenovani
	- automaticke odhalovani podezrele aktivity
- selhani logiky configuratoru
	- 2
	- 5 (urci spatne ceny apod.)
	- Poradne testovani i hranich moznosti
- chybne urceni ceny za kus
	- 3
	- 5 (ztrata penez, mozne pravni problemy)
	- Ceny dilu brat jen z overenych ceniku dodavatelu, ktere se budou aktualizovat
- chyby v UI
	- 3
	- 3 (uzivatel nedokonci objednavku)
	- Poradne testovani
	- zadany kontakt na podporu