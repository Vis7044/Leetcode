# Write your MySQL query statement below
with cte as (select emp_id, event_day, (out_time-in_time) as tt
            from Employees)
select event_day as day, emp_id, sum(ct.tt) as total_time
from cte ct
group by emp_id,event_day
order by event_day;