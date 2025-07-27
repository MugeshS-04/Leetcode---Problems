# Write your MySQL query statement below
SELECT S.student_id, S.student_name, SUB.subject_name, COUNT(E.SUBJECT_NAME) as attended_exams
FROM STUDENTS AS S CROSS JOIN SUBJECTS AS SUB LEFT JOIN EXAMINATIONS AS E
ON S.STUDENT_ID = E.STUDENT_ID AND sub.subject_name = e.subject_name
GROUP BY S.STUDENT_ID, SUB.SUBJECT_NAME 
ORDER BY S.STUDENT_ID, SUB.SUBJECT_NAME
