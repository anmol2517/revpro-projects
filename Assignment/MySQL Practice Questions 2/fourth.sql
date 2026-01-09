CREATE DATABASE company_db_q4;
USE company_db_q4;

CREATE TABLE employees_q4 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

CREATE TABLE job_history_q4 (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT
);

INSERT INTO employees_q4 VALUES
(1, 'Alice', 'Miller'),
(2, 'Bob', 'Davis'),
(3, 'Charlie', 'Wilson');

INSERT INTO job_history_q4 VALUES
(1, '2021-01-01', '2021-12-31', 'J001', 101),
(1, '2022-01-01', '2022-12-31', 'J002', 102),
(2, '2022-06-01', '2023-05-31', 'J003', 103);

SELECT e.employee_id, e.first_name, e.last_name,
       1 + COUNT(jh.employee_id) AS total_jobs
FROM employees_q4 e
LEFT JOIN job_history_q4 jh ON e.employee_id = jh.employee_id
GROUP BY e.employee_id, e.first_name, e.last_name;
