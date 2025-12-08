- staticky typ
	- pevna definice typu
	- je to presne dane co ta promena bude obsahovat
	- Car auto1 = new Car();
- dynamicky
	- definice podtypem
	- tady mohu ten typ menit, proto dynamicky
	- Vehicle v1 = new Car();

- Override
	- vemu methodu z nadtridy a prekryju ji
	- takze na konci dne mam vsude nejaky zpusob te methody

- vzdycky se jde od spoda
	- ![[Pasted image 20251208103529.png]]
	- kdyz chci pouzit neco z te nad tridy v podtride tak pouziju `super`
		- ![[Pasted image 20251208103628.png]]
		- tentokrat super nemusi byt na zacatku, narozdil od kontruktoru

- string builder

- v tride musi byt equals a jeste hashCode

- private vs protected
	- private
		- jedna knizka muze sahnout na nastaveni te druhe
	- protected
		- mohu manipulovat v ramci dedicnosti