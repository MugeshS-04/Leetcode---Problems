# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees AS E LEFT JOIN EmployeeUNI AS A
ON E.id = A.id
