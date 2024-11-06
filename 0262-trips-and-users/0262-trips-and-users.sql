# Write your MySQL query statement below

select p.request_at as Day,round(sum(status!='completed')/count(*),2) as 'Cancellation Rate'
from Trips p
inner join Users u on p.client_id = u.users_id
inner join Users x on p.driver_id = x.users_id
where request_at 
between '2013-10-01' and '2013-10-03'
and u.banned='No'
and x.banned = 'No'
group by request_at;