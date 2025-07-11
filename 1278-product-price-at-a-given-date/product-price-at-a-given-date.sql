# Write your MySQL query statement below

SELECT t1.product_id, IFNULL(new_price, 10) AS price
FROM (
    SELECT DISTINCT product_id 
    FROM Products 
) AS t1
LEFT JOIN (
    SELECT *
    FROM Products 
    WHERE (product_id, change_date) IN(
        SELECT product_id, MAX(change_date)
        FROM Products 
        WHERE change_date < '2019-08-17'
        GROUP BY product_id
    )
) AS t2 ON t1.product_id = t2.product_id