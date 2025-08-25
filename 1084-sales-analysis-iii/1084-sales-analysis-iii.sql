# Write your MySQL query statement below
SELECT DISTINCT S.product_id, product_name
FROM Product AS P JOIN Sales AS S
ON P.product_id = S.product_id
WHERE P.product_id NOT IN (
    SELECT product_id
    FROM Sales
    Where sale_date > "2019-03-31" OR Sale_date < "2019-01-01"
)