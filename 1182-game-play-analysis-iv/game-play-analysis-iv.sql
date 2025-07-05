# Write your MySQL query statement below
#  

SELECT ROUND(SUM(CASE WHEN T2.event_date IS NOT NULL THEN 1 ELSE 0 END) / COUNT(*), 2) AS fraction
FROM Activity T1
LEFT JOIN Activity T2 ON T1.player_id = T2.player_id AND DATE_ADD(T1.event_date, INTERVAL 1 DAY) = T2.event_date  

WHERE (T1.player_id, T1.event_date)  IN (
    SELECT player_id, MIN(event_date) 
    FROM Activity
    GROUP BY  player_id
)