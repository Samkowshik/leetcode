# Write your MySQL query statement below
#
SELECT T1.machine_id,  ROUND(2*SUM(T2.timestamp - T1.timestamp) / COUNT(T1.machine_id), 3) AS processing_time 

FROM Activity T1
LEFT JOIN Activity T2 ON T1.machine_id = T2.machine_id AND T1.process_id  = T2.process_id AND T1.activity_type   = 'START' AND T2.activity_type  = 'end'

GROUP BY T1.machine_id ;