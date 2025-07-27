# Write your MySQL query statement below
SELECT A1.name AS Employee
FROM Employee AS A1 JOIN Employee AS A2
ON A1.managerId = A2.id
WHERE A1.salary > A2.salary