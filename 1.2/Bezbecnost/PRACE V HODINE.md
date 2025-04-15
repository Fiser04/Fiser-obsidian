1. authentizacni mechanizmy - Zjistěte, jak v operačním systému, který používáte na svém počítači
a) Nastavíte jednotlivé požadavky na heslovou politiku:
	• délku hesla
	• znaky, které musí být v heslu použity
	• životnost hesla (doba po které je uživatel nucen heslo změnit)
	• počet neúspěšných pokusů o přihlášení, po kterém je jméno a heslo zablokováno
b) Pokuste se ve svém systému identifikovat uživatele, kteří nejsou využíváni a bylo by je možné zrušit (uživatele reálně bez konzultace nerušte :-)))
c) Existují ve vašem systému, nebo na systémech v domácí síti nezměněná implicitní hesla?
	(Implicitní hesla jsou hesla nastavená výrobcem zařízení/operačního systému a je nutné je ihned po uvedení zařízení do provozu změnit)
reseni:
a)
	sudo apt install libpam-cracklib libcrack2 wbritish
	sudo nvim /etc/pam.d/common-password
	password required pam_cracklib.so minlen=10 *minimalni delka 10*
	dcredit=-1 *alespon jedno cislo* 
	ucredit=-1 *alespon jedno velke pismeno* 
	lcredit=-1 *alespon jedno male pismeno* 
	ocredit=-1 *alespon jeden specialni znak*
	sudo nvim /etc/log.defs
	PASS_MAX_DAYS 30 *musi se menit po 30 dnech*
	PASS_MIN_DAYS 0 *doba co musi uplinout od posledni zmeny, tady muze ho zmenit hned po zmene*
	PASS_WARM_AGE 7 *dostane varovani pred vynucenou zmenou hesla, tady je to 7 dni*
	sudo nvim /etc/pam.d/common-auth
	auth required pam_faillock.so preauth silent deny=5 *po peti pokusech uzamkne ucet*
b)
	cat /etc/passwd
	a hledej
c) zarizeni o kterych vim co mame v provozu tak maj ruzne hesla

2. Praktická cvičení
a) Výpočet síly hesla
b) Pomůcky pro snadné zapamatování hesla
c) Aplikace pro správu heslel
d) Nastavení heslové politiky (Windows):
Ovládací panely - Nástroje pro správu - Místní zásady zabezpečení
Doporučené hodnoty:
Minimální délka hesla 8-9 znaků
Minimální životnost hesla (většinou mezi 1 a 7 dny)
Maximální životnost hesla (většinou ne více než 42 dnů)
Porovnávaná historie hesel by neměla být menší než 6
reseni:
a)
	pocet znaku v sade ^ pocet znaku hesla
	heslo o dvou cislech -> 10^2=100
b)
	treba nejak oblibena veta, hlaska z filmu, apod.
c)
	1Password
	LastPass
	Bitwarden
	Dashlane
	NordPass
d)