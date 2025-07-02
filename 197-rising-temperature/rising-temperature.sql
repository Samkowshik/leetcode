# Write your MySQL query statement below

SELECT T1.id 
FROM Weather T1, Weather T2
WHERE DATEDIFF(T1.recordDate, T2.recordDate ) = 1 AND T1.temperature>T2.temperature;