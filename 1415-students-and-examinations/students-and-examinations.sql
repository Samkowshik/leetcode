# Write your MySQL query statement below

SELECT  std.student_id, 
        std.student_name,
        sub.subject_name,
        COUNT(exm.subject_name) AS attended_exams 


FROM Students std
CROSS JOIN Subjects sub
LEFT JOIN Examinations exm ON std.student_id = exm.student_id AND sub.subject_name = exm.subject_name

GROUP BY std.student_id, std.student_name, sub.subject_name
ORDER BY std.student_id, sub.subject_name ;