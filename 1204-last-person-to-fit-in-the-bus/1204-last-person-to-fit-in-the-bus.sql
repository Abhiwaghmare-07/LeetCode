# Write your MySQL query statement below
select person_name from(select * ,sum(weight) over (order by turn) As running from Queue)  q
where running <=1000 
order by running desc 
Limit 1
