# Write your MySQL query statement below
SELECT machine_id, ROUND(AVG(duration), 3) as processing_time
FROM(
    SELECT A1.machine_id, A2.timestamp - A1.timestamp as duration
    FROM ACTIVITY AS A1 INNER JOIN ACTIVITY AS A2
    ON A1.machine_id = A2.machine_id AND A1.process_id = A2.process_id
    WHERE A1.activity_type = 'start' AND A2.activity_type = 'end'
) AS PROCESS_TIME 
GROUP BY machine_id;