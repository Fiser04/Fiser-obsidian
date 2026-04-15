- existuje SecurityManager, kterym nastavuji bezpecnostni politiku
	- v zakladu vypnuty
	- po zapnuti mohu "testovat" methodami (checkxxx)
	- `java -Djava.security.manager -Djava.security.policy=path/to/policyfile.policy YourApp`
	- ![[Pasted image 20260407100832.png|590]]

- TCP
	- vytvari se spojeni
		- ulehcuje praci, dela za me veci jakozto razeni apod
	- URL, URLConnection
	- Socket, ServerSocket

- UDP
	- spojeni neexistuje, proste data poslu do site, je jedno jestli dorazi nebo ne
	- DatagramPacket, DatagramSocket
	- MulticastSocket

- URL
	- Uniform Resource Locator
	- `protokol://[jméno[:heslo]@]server[:port][/cesta/[soubor[#pos]]][?proměnná=hodnota[&proměnná=hodnota]]`
	- ![[Pasted image 20260407103222.png]]
	- ![[Pasted image 20260407103334.png]]

- tvorba URL
	- ![[Pasted image 20260407103356.png]]
	- ![[Pasted image 20260407103516.png]]

- prace s URL
	- stejna prace jako se soubory
	- Varianta A
		- ![[Pasted image 20260407103702.png|564]]
			- prijmu v textovy podobe to co vyplyvne visualne get
				- html te stranky
				- json
	- Varianta B
		- ![[Pasted image 20260407104105.png]]
		- ![[Pasted image 20260407104207.png]]
		- vyhoda
			- MAM MOZNOST OVLADAT SPOJENI

- TCP sockety
	- socket = *softwarovy port*
		- ciste v me aplikaci
	- musi se nejdrive navazat spojeni
	- ![[Pasted image 20260407104932.png]]
		- socket - je socket
		- server socket - navazovani spojeni
	- postup
		- server posloucha na portu
		- vytvori se spojeni
		- pro jednoho clienta jeden socket spojeni


- UDP datagramy
	- ![[Pasted image 20260414100005.png]]
	- 