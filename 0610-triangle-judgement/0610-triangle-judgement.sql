# Write your MySQL query statement below
select x,y,z,case
          when x+y>z
          And y+z>x
          And x+z>y
          then 'Yes'
          else 'No'
          end
          As triangle from Triangle