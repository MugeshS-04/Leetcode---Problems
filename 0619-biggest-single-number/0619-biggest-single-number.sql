# Write your MySQL query statement below
SELECT MAX(num) as num
FROM MyNumbers
WHERE num IN (
    SELECT num 
    from MyNumbers 
    group by num 
    having count(*) = 1
)
