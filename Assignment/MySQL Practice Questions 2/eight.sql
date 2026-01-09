CREATE DATABASE company_db_q8;
USE company_db_q8;

CREATE TABLE employees_q8 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    manager_id INT
);

INSERT INTO employees_q8 VALUES
(1, 'Daniel', 'King', 90000, NULL),   -- Manager
(2, 'Sophia', 'Scott', 95000, 1),     -- Earns more than manager
(3, 'Oliver', 'Adams', 85000, 1),     -- Earns less than manager
(4, 'Emma', 'Baker', 70000, NULL),    -- Manager
(5, 'Liam', 'Turner', 75000, 4);      -- Earns more than manager

SELECT e.employee_id, e.first_name, e.last_name, e.salary, e.manager_id
FROM employees_q8 e
JOIN employees_q8 m ON e.manager_id = m.employee_id
WHERE e.salary > m.salary;
