# Write your MySQL query statement below


SELECT DISTINCT T1.num AS ConsecutiveNums 
FROM Logs T1
LEFT JOIN Logs T2 ON T1.id+1 = T2.id
LEFT JOIN Logs T3 ON T1.id+2 = T3.id

WHERE T1.num = T2.num AND T2.num = T3.num;