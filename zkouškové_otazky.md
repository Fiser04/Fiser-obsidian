# Studijní materiály: Umělá inteligence a neuronové sítě

Tento dokument obsahuje přehled 20 testových otázek a odpovědí zaměřených na algoritmy inspirované přírodou, fuzzy logiku, gradientní učení a topologie neuronových sítí.

---

### 1. Ant Colony Optimization (ACO)
* **Otázka:** Co platí o Ant colony optimization?
* **Správné odpovědi / Klíčové body:**
  * Rozhodnutí mravence přesunout se po hraně grafu do následujícího uzlu je dáno pravděpodobností, která závisí na ohodnocení hrany a množství feromonu na hraně.
  * Feromon je těkavá substance.

### 2. Fuzzy logika – pravdivá tvrzení
* **Otázka:** Co je pravda o Fuzzy logice?
* **Správné odpovědi / Klíčové body:**
  * Fuzzy pravidlo se skládá z **antecedentu** (předpokladu) a **consequentu** (závěru).
  * Funkce příslušnosti, případně fuzzy pravidla, mohou být optimalizovány na základě trénovací množiny obsahující páry vstup–výstup fuzzy kontroléru.
  * Fuzzy množina označená jako *HOT* (horko) má typicky míru příslušnosti rovnu $0$ pro teplotu vzduchu $-20\ ^\circ\text{C}$.

### 3. Gradientní učení
* **Otázka:** Co platí o gradientním učení?
* **Správné odpovědi / Klíčové body:**
  * Trénovací množina musí obsahovat příznaky (vstupy) a očekávané výstupy (labely) pro každý vzor.
  * Váhy jsou aktualizovány hodnotou počítanou jako:
    $$\Delta w = -\eta \cdot \nabla L$$
    *(mínus rychlost učení $\eta$ $\times$ gradient ztrátové funkce $L$)*

### 4. Maxpool vrstva
* **Otázka:** Co je pravda o Maxpool vrstvě?
* **Správné odpovědi / Klíčové body:**
  * Počítá maximum přes vstupy uvnitř okna vymezeného pozicí a velikostí kernelu.
  * Maxpool vrstva s kernelem $2\times2$ a posuvem (stride) o $2$ redukuje šířku a výšku vstupní vrstvy na polovinu.

### 5. Topologie neuronových sítí (základní)
* **Otázka:** Uveďte základní topologie neuronových sítí a popište je.
* **Odpověď:**
  * **Dopředná (Feedforward)** – signál putuje pouze od vstupu k výstupu, neobsahuje žádné zpětné vazby ani cykly.
  * **Rekurentní (RNN)** – obsahuje zpětné vazby, což síti dává vnitřní paměť; umožňuje efektivní zpracování sekvenčních dat (např. architektury *LSTM*, *GRU*).

### 6. Diverzita populace (genetický algoritmus)
* **Otázka:** Co je diverzita populace a proč ji musíme uměle různými metodami udržovat?
* **Odpověď:**
  * **Diverzita** představuje rozmanitost (rozprostření) jedinců v populaci v rámci prohledávaného stavového prostoru.
  * **Důvod udržování:** Zamezení *předčasné konvergenci* (situaci, kdy algoritmus uvízne v lokálním optimu) a zajištění důkladného prozkoumání celého řešitelského území (exploration).
  * **Metody udržování:** Mutace, specifické metody selekce (výběr i méně zdatných jedinců, turnajová selekce), penalizace podobnosti (niching, crowding) a křížení.

### 7. Konvoluční neuronová síť (CNN)
* **Otázka:** Popište konvoluční neuronovou síť.
* **Odpověď:**
  CNN se používá primárně k vyhledávání vzorů a hierarchických rysů v prostorových datech (např. v digitálním zpracování obrazu). Skládá se z následujících typických vrstev:
  * **Konvoluční vrstva** – aplikuje sady naučených filtrů (mřížky, např. $3\times3$) na vstupní data a vytváří tzv. *feature mapy* (detekuje hrany, textury, tvary).
  * **Aktivační vrstva (např. ReLU)** – zavádí do sítě nelinearitu, nejčastěji vynulováním záporných hodnot.
  * **Pooling vrstva (např. MaxPool)** – provádí downsampling (prostorovou redukci rozměrů), což snižuje výpočetní náročnost a zajišťuje invarianci vůči malým posunům.
  * **Plně propojené vrstvy (Fully Connected / Dense)** – nacházejí se na konci sítě a provádějí finální klasifikaci či regresi na základě extrahovaných rysů.

### 8. Topologie sousedství v SOM sítích
* **Otázka:** Jaké jsou topologie sousedství v sítích SOM (Self-Organizing Maps)? Popište.
* **Odpověď:**
  Topologie definuje, jak jsou neurony uspořádány na mapě a které z nich se považují za sousední při aktualizaci vah:
  * **Řetízková (lineární / 1D)** – Neurony jsou uspořádány v jedné řadě, každý neuron sousedí se svými nejbližšími sousedy vlevo a vpravo.
  * **Čtvercová (obdélníková / 2D)** – Klasická dvourozměrná mřížka, kde sousedství může být definováno jako 4-okolí (von Neumann) nebo 8-okolí (Moore).
  * **Hexagonální (šestiúhelníková)** – Každý vnitřní neuron má přesně 6 přímých sousedů, což umožňuje rovnoměrnější distribuci vzdáleností než čtvercová mřížka.
  * **Toroidální (uzavřená)** – Okraje mřížky jsou propojené (protilehlé strany na sebe navazují), čímž se eliminuje "okrajový efekt" mapy.

### 9. Defuzzyfikace – výpočet (příklad 1)
* **Otázka:** Proveďte defuzzyfikaci výstupní fuzzy množiny se singletony $(0; 0.1), (25; 0.2), (50; 0.4), (75; 0.2), (100; 0.1)$.
* **Výpočet metodou váženého průměru (těžiště):**
  $$y = \frac{0\cdot0.1 + 25\cdot0.2 + 50\cdot0.4 + 75\cdot0.2 + 100\cdot0.1}{0.1 + 0.2 + 0.4 + 0.2 + 0.1} = \frac{0 + 5 + 20 + 15 + 10}{1.0} = 50$$
* **Výsledek:** **50**

### 10. Defuzzyfikace – výpočet (příklad 2)
* **Otázka:** Proveďte defuzzyfikaci výstupní fuzzy množiny se singletony $(0; 0.7), (50; 0.2), (100; 0.1)$.
* **Výpočet metodou váženého průměru (těžiště):**
  $$y = \frac{0\cdot0.7 + 50\cdot0.2 + 100\cdot0.1}{0.7 + 0.2 + 0.1} = \frac{0 + 10 + 10}{1.0} = 20$$
* **Výsledek:** **20**

### 11. Parametry $\eta$ a $\alpha$ v učení
* **Otázka:** Popište parametry $\eta$ a $\alpha$ a jejich vliv na učící proces.
* **Odpověď:**
  * **$\eta$ (eta) – Rychlost učení (Learning Rate):** Určuje velikost kroku, který algoritmus provede ve směru opačném k gradientu. 
    * *Vysoká hodnota:* Rychlý počáteční pokrok, avšak hrozí oscilace kolem minima, divergence nebo nestabilita.
    * *Nízká hodnota:* Stabilní konvergence, ale učení trvá dlouho a roste riziko uvíznutí v lokálním minimu.
  * **$\alpha$ (alfa) – Setrvačnost (Momentum):** Zohledňuje směr a velikost předchozí změny vah. Pomáhá "přeletět" mělká lokální minima, zrychluje optimalizaci v oblastech s konstantním sklonem a tlumí oscilace v úzkých údolích ztrátové funkce.

### 12. Fuzzyfikace, inference, defuzzyfikace – vysvětlení pojmů
* **Otázka:** Vysvětlete pojmy fuzzyfikace, inference a defuzzyfikace.
* **Odpověď:**
  Jedná se o tři základní kroky fuzzy expertního/řídicího systému:
  1. **Fuzzyfikace:** Převod reálných (ostrých/crisp) vstupních hodnot ze senzorů na stupně příslušnosti ke zvoleným fuzzy množinám (v intervalu $[0, 1]$) pomocí funkcí příslušnosti (např. trojúhelníkových, trapezoidálních).
  2. **Inference (Fuzzy odvozování):** Vyhodnocení báze pravidel typu `IF-THEN` nad fuzzyfikovanými vstupy. Kombinuje logické operátory (AND/OR reprezentované jako T-normy a T-konormy) a generuje výslednou výstupní fuzzy množinu.
  3. **Defuzzyfikace:** Převod výsledné výstupní fuzzy množiny zpět na jednu ostrou (skalární) akční hodnotu, která se odešle na výstup (např. metoda těžiště COG neboli Center of Gravity).

### 13. Lokální minimum, přeučení, zobecnění
* **Otázka:** Co je uváznutí v lokálním minimu, přeučení a zobecnění?
* **Odpověď:**
  * **Uváznutí v lokálním minimu:** Optimalizační algoritmus (např. gradientní sestup) dosáhne bodu, kde je gradient nulový a okolní hodnoty ztrátové funkce jsou vyšší. Algoritmus se zde zastaví, přestože v celém prostoru existuje jiné, mnohem hlubší (globální) minimum.
  * **Přeučení (Overfitting):** Stav, kdy se model (síť) příliš detailně přizpůsobí specifickému šumu a detailům v trénovací množině. Na trénovacích datech vykazuje minimální chybu, ale na nových, dosud neviděných datech selhává.
  * **Zobecnění (Generalization):** Schopnost modelu správně a validně reagovat na nová, neznámá data, která nebyla součástí trénovací sady, ale pocházejí ze stejného rozdělení. Je to hlavní cíl učení neuronových sítí.

### 14. Hluboká neuronová síť, ReLU, POOL vrstva
* **Otázka:** Popište hlubokou neuronovou síť. Co je ReLU a POOL vrstva?
* **Odpověď:**
  * **Hluboká neuronová síť (DNN):** Síť obsahující velké množství skrytých vrstev mezi vstupem a výstupem. Umožňuje automaticky extrahovat komplexní hierarchické rysy (od jednoduchých hran po složité objekty).
  * **ReLU (Rectified Linear Unit):** Aktivační funkce definovaná jako $f(x) = \max(0, x)$. Propouští kladné hodnoty beze změny a záporné mění na nulu. Pomáhá efektivně řešit problém mizejícího gradientu (vanishing gradient) u hlubokých architektur.
  * **POOL vrstva (Pooling):** Subsamplovací vrstva, která agreguje informaci v lokálním okně (např. $2\times2$) a redukuje prostorové rozměry dat, čímž snižuje počet parametrů a šetří výpočetní výkon.

### 15. Fuzzy množina vs. standardní množina
* **Otázka:** Jak se liší fuzzy množina od standardní množiny?
* **Odpověď:**
  * **Standardní (klasická / Cantorova) množina:** Prvek do ní buď striktně patří, nebo nepatří. Charakteristická funkce nabývá pouze binárních hodnot $\{0, 1\}$.
  * **Fuzzy množina:** Připouští spojitou (odstupňovanou) míru příslušnosti prvku k množině vyjádřenou reálným číslem v uzavřeném intervalu $[0, 1]$. Jeden prvek tak může současně patřit do více různých fuzzy množin s různými stupni příslušnosti.

### 16. Algoritmus ACO – popis
* **Otázka:** Popište algoritmus ACO.
* **Odpověď:**
  **ACO (Ant Colony Optimization)** je pravděpodobnostní metaheuristika inspirovaná chováním reálných mravenců při hledání nejkratší cesty za potravou. 
  Mravenci (agenti) procházejí grafem a na navštívených hranách zanechávají chemickou stopu – **feromon**. Následující mravenci si vybírají další cestu stochasticky: pravděpodobnost volby hrany roste s množstvím feromonu na ní a s její lokální výhodností (např. převrácená hodnota délky hrany). Jelikož kratší cesty jsou projity rychleji, feromon se na nich akumuluje intenzivněji. Feromon se navíc v čase **odpařuje**, což zabraňuje uváznutí v suboptimálních řešeních a postupně eliminuje slepé uličky.

### 17. K-means algoritmus a jeho použití v neuronových sítích
* **Otázka:** Popište K-means algoritmus a uveďte, pro učení kterých neuronových sítí se používá.
* **Odpověď:**
  **K-means (K-středy)** je neřízený shlukovací (clustering) algoritmus, který funguje v těchto krocích:
  1. Náhodně se inicializuje $K$ středů (centroidů) shluků.
  2. Každý datový bod se přiřadí k nejbližšímu centroidu (zpravidla na základě Euklidovské vzdálenosti).
  3. Pozice centroidů se přepočítají jako aritmetický průměr všech bodů přiřazených k danému shluku.
  4. Kroky 2 a 3 se opakují, dokud se pozice středů stabilně nemění (konvergence).
  
  **Použití v NN:** Používá se pro inicializaci vah a určení center bázových funkcí u **RBF sítí** (Radial Basis Function), pro vektorovou kvantizaci a nastavení počátečních vah u **SOM** (kohonenových map), nebo pro bezpříznakové učení lokálních filtrů u specifických typů **CNN**.

### 18. BMU v SOM – výpočet
* **Otázka:** Jak se spočte BMU v neuronové síti typu SOM?
* **Odpověď:**
  **BMU (Best Matching Unit)** neboli nejlépe odpovídající neuron se určuje tak, že pro zadaný vstupní vektor $\mathbf{x}$ spočítáme vzdálenost k váhovým vektorům $\mathbf{w}_i$ všech neuronů v mapě. Neuron $c$, který minimalizuje tuto vzdálenost, je prohlášen za BMU:
  $$c = \arg\min_i \|\mathbf{x} - \mathbf{w}_i\|$$
  Nejčastěji se jako metrika používá klasická **Euklidovská vzdálenost**.

### 19. Aktivační funkce softmax a ReLU
* **Otázka:** Uveďte a popište aktivační funkce softmax a ReLU.
* **Odpověď:**
  * **ReLU (Rectified Linear Unit):** $f(x) = \max(0, x)$. Je výpočetně velmi nenáročná, odstraňuje záporné hodnoty a efektivně podporuje rychlé učení hlubokých sítí, protože její derivace je pro kladné hodnoty konstantně rovna 1.
  * **Softmax:** Převádí vektor reálných čísel (tzv. logity) $\mathbf{z}$ na vektor pravděpodobností o stejném rozměru, kde výsledné hodnoty leží v intervalu $(0, 1)$ a jejich součet je striktně roven 1. 
    $$f(z_i) = \frac{e^{z_i}}{\sum_{j} e^{z_j}}$$
    Používá se výhradně ve **výstupní vrstvě** klasifikačních sítí pro určení příslušnosti ke konkrétním třídám (multi-class classification).

### 20. Pravdivá tvrzení o genetickém algoritmu
* **Otázka:** Co je pravda o genetickém algoritmu?
* **Správné odpovědi / Klíčové body:**
  * Diverzitu populace můžeme udržet penalizací podobnosti genotypu ve výpočtu fitness (tzv. fitness sharing).
  * Prostor řešení je prohledáván více jedinci (celou populací) najednou, což umožňuje paralelní exploraci.
  * Optimalizační algoritmus maximalizuje účelovou funkci kvality jedince, zvanou **fitness**.
