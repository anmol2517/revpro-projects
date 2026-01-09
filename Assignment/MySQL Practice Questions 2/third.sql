CREATE DATABASE company_db_q3;
USE company_db_q3;

CREATE TABLE employees_q3 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    job_id VARCHAR(10)
);

CREATE TABLE job_history_q3 (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT
);

INSERT INTO employees_q3 VALUES
(1, 'Michael', 'Scott', 'J001'),
(2, 'Dwight', 'Schrute', 'J002'),
(3, 'Jim', 'Halpert', 'J003'),
(4, 'Pam', 'Beesly', 'J004');

INSERT INTO job_history_q3 VALUES
(2, '2022-01-01', '2023-01-01', 'J001', 101),
(3, '2021-06-01', '2022-06-01', 'J002', 102);

SELECT *
FROM employees_q3
WHERE employee_id NOT IN (SELECT DISTINCT employee_id FROM job_history_q3);
