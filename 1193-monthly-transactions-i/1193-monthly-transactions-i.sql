/* Write your T-SQL query statement below */

-- select FORMAT(trans_date, 'yyyy-MM') as month,country , count(state) as approved_count, sum(amount) as approved_total_amount from Transactions where
-- state = 'approved' group by country, FORMAT(trans_date, 'yyyy-MM');


SELECT  FORMAT(trans_date, 'yyyy-MM') as month, country, count(id) as trans_count, SUM(CASE WHEN state = 'approved' then 1 else 0 END) as approved_count, SUM(amount) as trans_total_amount, SUM(CASE WHEN state = 'approved' then amount else 0 END) as approved_total_amount
FROM Transactions
GROUP BY FORMAT(trans_date, 'yyyy-MM'), country;