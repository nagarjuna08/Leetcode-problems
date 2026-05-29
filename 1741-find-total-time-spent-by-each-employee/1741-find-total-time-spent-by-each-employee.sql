/* Write your T-SQL query statement below */
select event_day as day,emp_id,sum(timediff) as total_time from
(select emp_id,event_day,out_time-in_time as timediff from Employees) e
group by emp_id,event_day order by sum(timediff);