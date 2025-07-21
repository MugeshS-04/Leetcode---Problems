# Write your MySQL query statement below
SELECT MAX(NUM) AS num from MyNumbers where num in (SELECT num FROM MyNumbers group by NUM HAVING COUNT(NUM) = 1);