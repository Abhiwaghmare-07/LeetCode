# Write your MySQL query statement below
select p1.product_id ,IFNULL((select new_price from Products p2
                             where p1.product_id = p2.product_id And
                             p2.change_date <= '2019-08-16'
                             order by change_date desc
                             LIMIT 1)
                             ,10) As Price
                             from products p1
                             group by product_id