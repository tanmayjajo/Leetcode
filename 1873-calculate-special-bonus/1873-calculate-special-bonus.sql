SELECT employee_id,
IF (SUBSTRING(name, 1, 1) <> 'M' AND employee_id % 2 = 1, salary, 0) AS bonus
FROM Employees
ORDER BY employee_id;