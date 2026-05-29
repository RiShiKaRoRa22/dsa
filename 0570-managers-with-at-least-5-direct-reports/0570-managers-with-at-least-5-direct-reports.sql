# Write your MySQL query statement below
select e.name as name from Employee e where e.id in(select f.managerId from Employee f group by f.managerId having count(f.managerId)>=5)