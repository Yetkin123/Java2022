--Select
--ANSI
SELECT ContactName Adi, CompanyName SirketAdi, City Sehir FROM Customers

SELECT * FROM Customers WHERE City = 'Berlin'

--Case insensitive
SELECT * FROM Products WHERE CategoryID = 1 OR CategoryID = 3

SELECT * FROM Products WHERE CategoryID = 1 AND UnitPrice >= 10

SELECT * FROM Products WHERE CategoryID = 1 ORDER BY UnitPrice DESC --ascending ASC --DESCENDING DESC

SELECT COUNT(*) Adet FROM Products

SELECT CategoryID, COUNT(*) FROM Products WHERE UnitPrice > 20 GROUP BY CategoryID HAVING COUNT(*)<10

SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName FROM Products INNER JOIN Categories
ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice > 10

--DTO Data Transformation Object

SELECT * FROM Products p LEFT JOIN [Order Details] od ON p.ProductID = od.ProductID
INNER JOIN Orders o ON o.OrderID = od.OrderID

SELECT * FROM Customers c LEFT JOIN Orders o ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL

