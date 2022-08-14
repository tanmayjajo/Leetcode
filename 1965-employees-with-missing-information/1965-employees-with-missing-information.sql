SELECT EM.employee_id 
FROM (SELECT employee_ID FROM Employees UNION ALL SELECT employee_id FROM Salaries) AS EM
GROUP BY EM.employee_id 
HAVING COUNT(EM.employee_id) = 1
ORDER BY EM.employee_id 
