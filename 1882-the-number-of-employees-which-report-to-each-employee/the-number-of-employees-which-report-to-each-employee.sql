# Write your MySQL query statement below

SELECT T1.employee_id, 
        T1.name,
        COUNT(T1.employee_id) AS reports_count,
        ROUND(AVG(T2.age),0)  AS average_age 

FROM Employees T1
LEFT JOIN Employees T2 ON T1.employee_id = T2.reports_to 

GROUP BY T1.employee_id
HAVING COUNT(T2.employee_id) > 0
ORDER BY employee_id;