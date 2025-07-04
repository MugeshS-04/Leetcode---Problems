# Write your MySQL query statement below
SELECT W1.id as Id FROM Weather W2 cross join 
Weather W1 on DateDiff(W1.recordDate, W2.recordDate) = 1 where
W1.temperature > W2.temperature 