CREATE DATABASE company_db_q13;
USE company_db_q13;

CREATE TABLE employees_q13 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    job_id VARCHAR(10),
    department_id INT
);

CREATE TABLE job_history_q13 (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT
);

INSERT INTO employees_q13 VALUES
(1, 'Alice', 'Miller', 'J001', 101),
(2, 'Bob', 'Smith', 'J002', 101),
(3, 'Charlie', 'Brown', 'J003', 102),
(4, 'David', 'Jones', 'J004', 103);

INSERT INTO job_history_q13 VALUES
(1, '2021-01-01', '2021-12-31', 'J001', 101),
(2, '2022-01-01', '2022-12-31', 'J005', 102),
(3, '2020-06-01', '2021-06-01', 'J003', 102);

SELECT *
FROM employees_q13
WHERE job_id NOT IN (SELECT DISTINCT job_id FROM job_history_q13);
