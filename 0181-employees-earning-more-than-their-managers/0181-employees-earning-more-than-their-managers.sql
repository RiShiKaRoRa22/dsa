# Write your MySQL query statement below

select e.name as Employee from Employee e where e.salary>(select f.salary from Employee f where f.id=e.managerId)
