- jeden kloub a jeden vysouvaci
	- ![[Pasted image 20260227135013.png]]
	- *Úhel Θ počítáme od osy x zdola nahoru*
		- proste uhel k ose x
	- *Délku l počítáme od osy otáčení k úchopovému bodu End effectoru.*
	- realizace
		- otocny
			- servo (od 0 do 180 s odchylkou 5 stupnu)
		- vysouvaci
			- hydraulika
			- sroub
	- pracovni prostor
		- ![[Pasted image 20260227135344.png]]
	- pracovni uloha 
		- x = l cos(Θ)
		- y = l sin(Θ)
	- neprima uloha
		- Známe $x$ a $y$ a chceme určit $l$ a $\Theta$:
$$\begin{aligned}
l &= \sqrt{x^2 + y^2} \\
\Theta &= \arctan\left(\frac{y}{x}\right)
\end{aligned}
$$
	- konfiguracni prostor
		- ![[Pasted image 20260227135507.png]]

- robot s dvema otocnymi klouby
	- ![[Pasted image 20260227140513.png]]
	- Přímá úloha
$$
\begin{aligned}
x &= l_1 \cdot \cos(\Theta_1) + l_2 \cdot \cos(\Theta_1 + \Theta_2) \\
y &= l_1 \cdot \sin(\Theta_1) + l_2 \cdot \sin(\Theta_1 + \Theta_2)
\end{aligned}
$$
	- Zpětná úloha
$$
\begin{aligned}
r^2 &= x^2 + y^2 \\
\Theta_2 &= \arccos\left(\frac{r^2 - l_1^2 - l_2^2}{2l_1l_2}\right)
\end{aligned}
$$
		- 2 řešení:
			1. $\Theta_1 = \arctan\left(\frac{y}{x}\right) - \arctan\left(\frac{l_2 \sin(\Theta_2)}{l_1 + l_2 \cos(\Theta_2)}\right), \Theta_2$
			2. $\Theta_1 = \arctan\left(\frac{y}{x}\right) + \arctan\left(\frac{l_2 \sin(\Theta_2)}{l_1 + l_2 \cos(\Theta_2)}\right), -\Theta_2$

