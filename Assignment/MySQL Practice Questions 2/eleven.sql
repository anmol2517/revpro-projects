CREATE DATABASE company_db_q11;
USE company_db_q11;

CREATE TABLE departments_q11 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees_q11 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT
);

CREATE TABLE job_history_q11 (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT
);

INSERT INTO departments_q11 VALUES
(501, 'HR'),
(502, 'Finance'),
(503, 'IT');

INSERT INTO employees_q11 VALUES
(1, 'Liam', 'Walker', 501),
(2, 'Emma', 'Hall', 502),
(3, 'Noah', 'Allen', 503);

INSERT INTO job_history_q11 VALUES
(2, '2022-01-01', '2022-12-31', 'J001', 502);

SELECT d.*
FROM departments_q11 d
LEFT JOIN job_history_q11 jh ON d.department_id = jh.department_id
WHERE jh.employee_id IS NULL;
