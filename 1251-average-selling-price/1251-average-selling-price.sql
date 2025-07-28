# Write your MySQL query statement below
SELECT P.product_id, ROUND(SUM(P.price * units) / SUM(units), 2) AS average_price
FROM PRICES AS P JOIN UNITSSOLD AS U
ON P.product_id = U.product_id
WHERE purchase_date BETWEEN P.start_date AND P.end_date
GROUP BY P.product_id