# Write your MySQL query statement below


SELECT T1.id, IFNULL((CASE WHEN T1.id%2=1 
                    THEN T2.student
                    WHEN T1.id%2=0
                    THEN T3.student
                END), T1.student) AS student 
FROM Seat T1
LEFT JOIN Seat T2 ON T1.id + 1 = T2.id
LEFT JOIN Seat T3 ON T1.id - 1 = T3.id