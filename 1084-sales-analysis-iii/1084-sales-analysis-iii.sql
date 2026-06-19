/* Write your T-SQL query statement below */

select product_id,product_name
from
    (select p.product_id,p.product_name,max(s.sale_date) as last_date,min(s.sale_date) as first_date
    from Product p join Sales s on p.product_id=s.product_id
    group by p.product_id,product_name) res
where ('2019-01-01'<=first_date) and (last_date<='2019-03-31')