# Write your MySQL query statement below

SELECT product_name, SUM(unit) as unit 
FROM Orders O JOIN Products P
ON P.product_id = O.product_id
WHERE Order_date > "2020-01-31" AND Order_date < "2020-03-01"
GROUP BY P.product_id
HAVING SUM(unit) >= 100