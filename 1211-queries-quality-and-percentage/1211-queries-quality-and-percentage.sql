# Write your MySQL query statement below
SELECT query_name, 
ROUND(SUM(rating / position) / COUNT(query_name), 2) as quality,
ROUND(AVG(CASE WHEN rating < 3 THEN 1 ELSE 0 END * 100), 2) AS poor_query_percentage
FROM Queries As Q1
GROUP BY Q1.query_name