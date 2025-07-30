# Write your MySQL query statement belo 
SELECT project_id, ROUND(AVG(experience_years), 2) as average_years
FROM PROJECT AS P JOIN EMPLOYEE AS E
ON P. employee_id = E.employee_id
GROUP BY project_id