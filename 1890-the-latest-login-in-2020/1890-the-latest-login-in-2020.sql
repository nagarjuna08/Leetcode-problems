/* Write your T-SQL query statement below */



WITH RankedRecords AS
(select user_id,time_stamp,row_number() over (partition by user_id order by time_stamp desc) as rn
from Logins where year(time_stamp)=2020)
select user_id, time_stamp as last_stamp from RankedRecords where rn=1;