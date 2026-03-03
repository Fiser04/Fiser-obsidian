- gui
	- graphical user interface

- ZAKLAD
	- **Uzivatel se nechce nikdy ucit neco noveho**

- hlavni 2 role
	- Uzivatel -> Aplikace
		- prenos pozadavku a pokynu
		- *kliknu na tlacitko 2*
	- Aplikace -> Uzivatel
		- prezentace vysledku

- komponenty
	- stavebni bloky gui
	- tlacitka, menu, posuvniky

- rozvrzeni
	- snaha o pohodlne rozvrzeni komponent z pohledu uzivatele

- udalosti
	- reakce na udalost ala *zmacknu tlacitko*

- AWT a Swing
	- framework pro graficke rozhrani
	- ![[Pasted image 20260303100453.png]]
	- vyhody
		- standartni soucast javy
	- vhodne pro jednoduchy nahled
		- z duvodu rychlosti psani
	- Swing je nastavba awt

- javaFX
	- framework pro detailni reseni
	- externi knihovna (nutna instalace a integrace)

- prvky aplikacniho okna
	- ![[Pasted image 20260303100749.png]]
	- zakladni okno je zaklad (Frame)
	- ovladaci prvky
		- v zakladu nejsou funkcni
		- *kliknu na x, okno se zavre, ale na pozadi to furt jede*
	- titulek
	- pak jsou to podcasti
		- menu
		- panel s konkretnim obsahem

- jak na to v jave
	- zaklad frame
		- ![[Pasted image 20260303101201.png]]vs![[Pasted image 20260303101404.png]]
		- to druhe neni uplne v pohode z duvodu, co kdyz potrebuju najednou dedit od neceho jineho
	- panel s obsahem
		- ![[Pasted image 20260303101605.png]]
		- getContentPane zastupuje vnitrek toho okna
		- *do komponentu vlozim jiny komponent a do toho vlozim jiny komponent* - HTML ahh
		- methoda pack()
			- to co v okne ma byt a rozlozi ho do spravneho rozlozeni
			- alternativa
				- setSize()
					- nastavi velikost okna
				- setBounds()
	- menu
		- JMenuBar
			- root menu, je to vykresleno pod titulkem, obsahuje menu
		- JMenu
			- kategorie menu (File, Help, ...)
		- JMenuItem
			- samostatna cast kategorie (Open, Save, Save as, Quit)
		- ![[Pasted image 20260303102010.png]]