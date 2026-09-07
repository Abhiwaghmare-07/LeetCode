# Write your MySQL query statement below
select "Low Salary" As category,
sum(if(income<20000,1,0)) As accounts_count from Accounts
Union
select "Average Salary" as category,
sum(if(income between 20000 and 50000,1,0)) AS accounts_count from Accounts
Union 
select "High Salary" As category,
sum(if(income>50000,1,0)) As accounts_count from Accounts