aktualizace operacniho systemu
	- windows
		- mam pomoci registru zapnute jen dulezite aktualizace
			- windows neresi aktualizaci driveru
			- vypnuti automatickych restartu
			- velke aktualizace zpozdeni o rok
			- male aktualizace o 4 dny
	- linux
		- manualne
		- sudo apt update && sudo apt upgrade
	- android
		- oznameni
aktualizace programu 3. stran
	- windows 
		- pouzivam winget nebo se pusti aktualizace pri spusteni programu
	- linux 
		- package manager
	- android 
		- jednou za x dni otevru list programu co potrebuji aktualizovat, dam aktualizovat vse
eicar test
	- linux (ClamAV)
		- Win.Test.EICAR_HDB-1
antivirus
	- linux (ClamAV)
		- aktualizace siganture
			- kazdy den v 23:00
		- scan
			- kazdy den v 23:30
		- vypne ho jen root
vlozeni usb disku
	- linux
		- malualni mount, pak davam manualne scan disku (clamscan -r %d)