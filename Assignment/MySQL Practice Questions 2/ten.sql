CREATE DATABASE company_db_q10;
USE company_db_q10;

CREATE TABLE employees_q10 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT
);

CREATE TABLE job_history_q10 (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    department_id INT,
    job_id VARCHAR(10)
);

INSERT INTO employees_q10 VALUES
(1, 'John', 'Miller', 101),
(2, 'Jane', 'Smith', 102),
(3, 'Alice', 'Brown', 103);

INSERT INTO job_history_q10 VALUES
(1, '2021-01-01', '2021-12-31', 101, 'J001'),
(1, '2022-01-01', '2022-12-31', 102, 'J002'),
(2, '2022-06-01', '2023-05-31', 102, 'J003'),
(3, '2020-01-01', '2020-12-31', 103, 'J004'),
(3, '2021-01-01', '2021-12-31', 104, 103);

SELECT employee_id, first_name, last_name
FROM (
    SELECT employee_id, department_id FROM employees_q10
    UNION ALL
    SELECT employee_id, department_id FROM job_history_q10
) t
GROUP BY employee_id
HAVING COUNT(DISTINCT department_id) > 1;
