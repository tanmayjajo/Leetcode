SELECT employee_id,
IF (name NOT LIKE 'M%' AND employee_id % 2 = 1, salary, 0) AS bonus
FROM Employees
ORDER BY employee_id;