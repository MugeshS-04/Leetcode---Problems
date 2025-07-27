# Write your MySQL query statement below
SELECT id 
FROM WEATHER
WHERE id IN (
    SELECT A2.id 
    FROM Weather AS A1 JOIN Weather AS A2
    ON DATEDIFF(A2.recordDate, A1.recordDate) = 1
    WHERE A2.temperature > A1.temperature
)