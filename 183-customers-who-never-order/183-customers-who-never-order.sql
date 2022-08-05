SELECT name AS Customers
from Customers 
LEFT JOIN Orders ON Customers.id = Orders.customerId
WHERE customerId IS NULL;