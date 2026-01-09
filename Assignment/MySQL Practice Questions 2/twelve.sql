CREATE DATABASE company_db_q12;
USE company_db_q12;

CREATE TABLE employees_q12 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    manager_id INT
);

INSERT INTO employees_q12 VALUES
(1, 'Oliver', 'Smith', NULL),   -- Manager
(2, 'Sophia', 'Brown', 1),
(3, 'Liam', 'Johnson', 1),
(4, 'Emma', 'Davis', 1),
(5, 'Noah', 'Miller', 1),
(6, 'Ava', 'Wilson', 1),
(7, 'Mason', 'Moore', 1),
(8, 'Isabella', 'Taylor', NULL),  -- Another manager
(9, 'Lucas', 'Anderson', 8),
(10, 'Mia', 'Thomas', 8);

SELECT manager_id, COUNT(*) AS num_employees
FROM employees_q12
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING COUNT(*) > 5;
