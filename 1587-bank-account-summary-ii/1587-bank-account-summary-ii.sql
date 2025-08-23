# Write your MySQL query statement below
SELECT name, SUM(amount) as balance
FROM Users AS U INNER JOIN Transactions AS T
ON U.account = T.account
GROUP BY U.account
ORDER BY balance DESC 
LIMIT 1


