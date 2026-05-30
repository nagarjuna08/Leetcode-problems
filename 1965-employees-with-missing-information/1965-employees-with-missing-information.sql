/* Write your T-SQL query statement below */
select employee_id from
(SELECT COALESCE(e.employee_id, s.employee_id) AS employee_id
FROM Employees e
FULL OUTER JOIN Salaries s
    ON e.employee_id = s.employee_id
WHERE e.employee_id IS NULL
   OR s.employee_id IS NULL
   ) q order by employee_id;

-- SELECT e.employee_id FROM Employees e 
-- LEFT JOIN Salaries s ON e.employee_id = s.employee_id 
-- WHERE s.employee_id IS NULL

-- UNION

-- SELECT s.employee_id FROM Salaries s 
-- LEFT JOIN Employees e ON e.employee_id = s.employee_id 
-- WHERE e.employee_id IS NULL

-- ORDER BY employee_id ASC