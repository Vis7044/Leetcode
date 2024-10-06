# Write your MySQL query statement below

select event_day as day, emp_id, sum(ct.tt) as total_time
from (select emp_id, event_day, (out_time-in_time) as tt
            from Employees) as ct
group by emp_id,event_day
order by event_day;