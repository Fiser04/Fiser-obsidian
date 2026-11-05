- char(10) - vzdy alokuje
- varchar - prvni 2 bytes kde je delka textu
- nvarchar - utf-8


- v zapoctu bude urcite nejaka agregace
	- `SELECT s.ShipperID, s.CompanyName, COUNT(o.OrderID) count_ord FROM Shippers s LEFT JOIN Orders o ON s.ShipperID = o.ShipVia GROUP BY s.ShipperID, s.CompanyName HAVING COUNT(o.OrderID) > 250 ORDER BY COUNT(o.OrderID) DESC`
	- `SELECT * FROM Employees WHERE EmployeeID NOT IN (SELECT DISTINCT o. EmployeeID FROM Orders o INNER JOIN [Order Details] od ON o. OrderID = od. OrderID INNER JOIN Products p ON od. ProductID = p.ProductID WHERE p.ProductName = 'Filo Mix')`
	- `SELECT * FROM Employees e LEFT JOIN (SELECT * FROM Orders o WHERE YEAR(OrderDate)=1996) ON e. EmployeeID = o. EmployeeID WHERE o. OrderID IS NULL`

- postup pristupu na server
	- ![[Pasted image 20261029145847.png]]
- execution plan
	- ![[Pasted image 20261029150155.png]]
		- pro debugovani pomale odpovedi na dotaz

- kdyz je dotaz pomaly tak koukam po
	- kolik radku dostavam
		- kdyz je toho hodne tak to bude pomaly tak ci onak
	- jestli vsechny data na ktere se ptam potrebuju
	- zpomaleni site/serveru
	- kontrola execution planu