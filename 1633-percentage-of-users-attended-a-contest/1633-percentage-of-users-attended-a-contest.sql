# Write your MySQL query statement below
SELECT contest_id, ROUND(COUNT(R.user_id) / (SELECT COUNT(user_id) FROM Users) * 100, 2) AS percentage
FROM Users AS U JOIN Register AS R
ON U.user_id = R.user_id
GROUP BY contest_id
ORDER BY percentage DESC, contest_id 