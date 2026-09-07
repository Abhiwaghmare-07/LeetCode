# Write your MySQL query statement below

(select u.name as results
from Users u
left join MovieRating mr
on u.user_id = mr.user_id
group by mr.user_id
order by count(mr.user_id) desc ,u.name limit 1)
union all
(select m.title as results
from Movies m
left join MovieRating mr
on m.movie_id = mr.movie_id
 WHERE created_at >= '2020-02-01'
  AND created_at < '2020-03-01'
group by m.movie_id, m.title

order by Avg(mr.rating) desc,m.title Limit 1)