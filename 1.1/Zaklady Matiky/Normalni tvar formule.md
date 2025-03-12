pr. ![[Pasted image 20241015152021.png]] 

| p   | q   | ![[Pasted image 20241015152100.png]] | ![[Pasted image 20241015152121.png]] | ![[Pasted image 20241015152151.png]] | ![[Pasted image 20241015152021.png]] |
| --- | --- | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| 0   | 0   | 1                                    | 0                                    | 0                                    | 1                                    |
| 0   | 1   | 0                                    | 1                                    | 1                                    | 1                                    |
| 1   | 0   | 1                                    | 1                                    | 0                                    | 0                                    |
| 1   | 1   | 0                                    | 1                                    | 0                                    | 0                                    |

**Disjunktivni**
vemu tam kde je vysledek 1, udelam x zavorek podle poctu 1
![[Pasted image 20241015152735.png]]
prvni 2 sloupce urcuji znamenko pred p a q, 0 je negace a vyplnim (toto je vysledek "DNF")
![[Pasted image 20241015152854.png]]
pak to podle logicke ekvivalence upravim (jen kdyz bude receno ze mam udelat)
![[Pasted image 20241015153006.png]]
![[Pasted image 20241015153034.png]]
![[Pasted image 20241015153048.png]]

**Konjuktivni**
vemu tam kde je vysledek 0, udelam x zavorek podle poctu 0
![[Pasted image 20241015152735.png]]
prvni 2 sloupce urcuji znamenko pred p a q, 0 je negace a vyplnim
![[Pasted image 20241015153725.png]]
pomoci Morganovych zakonu upravim na tvar ![[Pasted image 20241015153819.png]](zneguji)

![[Pasted image 20241015153933.png]]
![[Pasted image 20241015154017.png]]
![[Pasted image 20241015154055.png]] (toto je vysledek "KNF")
pak to podle logicke ekvivalence upravim (jen kdyz bude receno ze mam udelat)
![[Pasted image 20241015154237.png]]
![[Pasted image 20241015154258.png]]
![[Pasted image 20241015154309.png]]



