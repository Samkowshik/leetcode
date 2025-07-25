# Write your MySQL query statement below


-- SELECT DISTINCT YEAR(trans_date) AS YEAR, MONTH(trans_date) AS MONTH
-- FROM Transactions 

SELECT SUBSTRING(trans_date, 1, 7) AS month, 
        country, 
        COUNT(*) AS trans_count,
        SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
        SUM(amount) AS trans_total_amount,
        SUM(CASE WHEN state = 'approved' THEN amount  ELSE 0 END) AS approved_total_amount 
FROM Transactions
GROUP BY YEAR(trans_date), MONTH(trans_date), country