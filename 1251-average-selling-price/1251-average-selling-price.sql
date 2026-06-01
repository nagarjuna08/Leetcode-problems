/* Write your T-SQL query statement below */
SELECT 
    pid AS product_id,
    ROUND(ISNULL(SUM(totalprice)*1.0 / SUM(uni), 0), 2) AS average_price
FROM (
    SELECT 
        p.product_id AS pid,
        p.price * u.units AS totalprice,
        u.units AS uni
    FROM Prices p
    LEFT JOIN UnitsSold u
        ON p.product_id = u.product_id
        AND u.purchase_date BETWEEN p.start_date AND p.end_date
) t
GROUP BY pid;