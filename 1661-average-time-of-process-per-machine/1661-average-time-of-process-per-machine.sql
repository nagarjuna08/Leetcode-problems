/* Write your T-SQL query statement below */

select machine_id, Round((sum(diff)/count(distinct process_id)),3) as processing_time from 
(select machine_id, process_id, 
sum(
    case 
        when activity_type='start' then -1*timestamp
        else timestamp
        end
) as diff from Activity group by  machine_id, process_id) res
group by machine_id order by (sum(diff)/count(distinct process_id)) desc ;