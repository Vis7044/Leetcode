# Write your MySQL query statement below

select distinct(num) as ConsecutiveNums from
    (
        select num,
        lag(num,1) over(order by id) as prev,
        lag(num, 2) over(order by id) as sprev
        from Logs
    ) as cons
    where num=prev and prev = sprev;