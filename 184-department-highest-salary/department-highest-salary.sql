# Write your MySQL query statement below

select t2.name as Department, t1.name as Employee, Salary 
from(
    select *, rank() over(partition by departmentId order by Salary desc) as rnk
    from employee
    ) t1
LEFT JOIN Department t2 ON t1.departmentId = t2.id
where rnk = 1;
