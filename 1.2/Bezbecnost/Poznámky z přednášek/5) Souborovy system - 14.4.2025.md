castecne pokracovani [[5) Skodlivy kod - 14.4.2025]]
musi mit mechanismy aby "jsme si nelezli do zeli"
	- ridit pristup k vlastnim souborum
		- Access Control List (ACL)
			- Windows
				- se prihlasim, dostanu jsem identifikator uzivatele a podle nej mam opravneni ohledne souboru
				- soubor -> vlastnosti -> bezpecnost(security)
			- Linux
				- pomoci prava ala chmod
				- co to je, prava vlastnika, prava skupiny, prava ostatnich
				- r - read, w - write, x - execute
				- v pripade adresare
					- r - precist co je v adresari
					- w - pridavat, odstranovat soubory
					- x - prochazet adresarem
			- ke zkousce
				- misto x je S 
					- set user ID (u uzivatele)
					- set group ID (u skupiny)
				- program spusteny s x se pousti s opravnenymi toho kdo to spustil, ale s S tak se pusti s pravami majitele toho souboru
				- dobry priklad jsou emaily, program chce pristup do vasi stranky aby mohl zapsat novy mail do schranky
				- nebezpecne je mit rws .wx .wx, protoze si muzu napsat do programu co chci, takze bych proste mohl pustit radku s root pravama, kdyz by soubor vlastnil root (casto vlastni)

sifrovani
	- "kdyz proste ukradnu neci disk, tak ho proste muzu pripojit a dela si s daty co chce"
	- a kdyz to bude zasifrovany tak mam smulu, good luck prolomovani nejakyho 30 let dlouhyho hash
	- bud samotny soubor
		- soubor -> properties -> advanced -> encrypt ...
	- nebo celej disk
		- bitLocker
		- sifrovani pri instalaci u Linuxu
	- jde pouzit treba nastroj truecrypt
		- rozdelim disk na vice zasifrovanych oblasti a ke kazdymu mam jiny heslo
		- neni zpusob jak zjistit ze je tam vice oblasti

integrita souboru
	- casto poznam podle ni jestli jsem napaden
	- pr. tripwire
	- veme soubor, vypocita hash a hodi ho do databaze, kdyz je hash totoznej, je to v pohode, kdyz neni stejnej tak vim ze se s souborem neco stalo
	- co casto takto resit
		- konfigurace firewallu a dalsich bezpecnostnich casti
		- /etc/passwd
		- modifikace systemovych prikazu (/usr/bin, /usr/local/bin)