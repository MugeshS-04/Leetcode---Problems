# Write your MySQL query statement below
SELECT name 
FROM SALESPERSON
where sales_id NOT IN(
    SELECT S.sales_id
    FROM ORDERS AS O 
    JOIN COMPANY AS C ON O.com_id = C.com_id
    JOIN SALESPERSON AS S ON S.sales_id = O.sales_id
    WHERE C.name = "RED"
) 
