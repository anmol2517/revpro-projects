CREATE DATABASE company_db_q7;
USE company_db_q7;

CREATE TABLE employees_q7 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT,
    manager_id INT
);

CREATE TABLE departments_q7 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

INSERT INTO departments_q7 VALUES
(301, 'Operations'),
(302, 'Customer Support');

INSERT INTO employees_q7 VALUES
(1, 'Ethan', 'Harris', 301, NULL),    -- Manager
(2, 'Ava', 'Clark', 301, 1),          -- Same department as manager
(3, 'Lily', 'Lewis', 302, NULL),      -- Manager
(4, 'Mason', 'Walker', 301, 1),       -- Same department as manager
(5, 'Ella', 'Hall', 302, 3);          -- Same department as manager

SELECT e.employee_id, e.first_name, e.last_name, e.department_id
FROM employees_q7 e
JOIN employees_q7 m ON e.manager_id = m.employee_id
WHERE e.department_id = m.department_id;
