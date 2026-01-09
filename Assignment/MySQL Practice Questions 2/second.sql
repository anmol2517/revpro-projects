CREATE DATABASE company_db_q2;
USE company_db_q2;

CREATE TABLE departments_q2 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees_q2 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT
);

INSERT INTO departments_q2 VALUES
(201, 'Accounting'),
(202, 'HR'),
(203, 'IT'),
(204, 'Logistics');

INSERT INTO employees_q2 VALUES
(1, 'Alice', 'Johnson', 201),
(2, 'Bob', 'Williams', 202);

SELECT d.*
FROM departments_q2 d
LEFT JOIN employees_q2 e ON d.department_id = e.department_id
WHERE e.employee_id IS NULL;
