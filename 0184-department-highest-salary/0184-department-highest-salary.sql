/* Write your PL/SQL query statement below */
select d.name AS Department, e.name AS Employee, e.salary from Employee e INNER JOIN  Department d on e.departmentId=d.id where e.salary=( SELECT MAX(e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId);