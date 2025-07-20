# Write your MySQL query statement below
SELECT name, COALESCE(SUM(distance), 0) as travelled_distance 
FROM Users LEFT JOIN Rides 
ON Users.id = user_id 
GROUP BY Users.id 
ORDER BY SUM(distance) DESC, name;