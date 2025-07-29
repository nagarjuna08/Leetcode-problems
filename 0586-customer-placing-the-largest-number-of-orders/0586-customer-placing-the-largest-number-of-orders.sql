/* Write your PL/SQL query statement below */
select customer_number from (select customer_number from Orders group by customer_number order by count(*)DESC ) where ROWNUM=1;