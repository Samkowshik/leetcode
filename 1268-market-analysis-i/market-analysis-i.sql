# Write your MySQL query statement below

SELECT user_id AS "buyer_id", join_date, IFNULL(orders_in_2019, 0) AS orders_in_2019
FROM Users AS t1
LEFT JOIN (
    SELECT buyer_id, COUNT(*) AS orders_in_2019 
    FROM Orders 
    WHERE YEAR(order_date) = 2019
    GROUP BY buyer_id 
) AS t2 ON user_id = buyer_id 
