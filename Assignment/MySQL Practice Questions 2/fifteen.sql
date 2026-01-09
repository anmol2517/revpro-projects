CREATE DATABASE company_db_q15;
USE company_db_q15;

CREATE TABLE jobs_q15 (
    job_id VARCHAR(10) PRIMARY KEY,
    job_title VARCHAR(50),
    min_salary DECIMAL(10,2),
    max_salary DECIMAL(10,2)
);

CREATE TABLE departments_q15 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees_q15 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    job_id VARCHAR(10),
    department_id INT
);

INSERT INTO jobs_q15 VALUES
('J001', 'Sales Executive', 50000, 100000),
('J002', 'Marketing Specialist', 55000, 95000),
('J003', 'Developer', 60000, 120000);

INSERT INTO departments_q15 VALUES
(101, 'Sales'),
(102, 'Marketing'),
(103, 'IT');

INSERT INTO employees_q15 VALUES
(1, 'Alice', 'Miller', 70000, 'J001', 101),
(2, 'Bob', 'Smith', 80000, 'J001', 101),
(3, 'Charlie', 'Brown', 60000, 'J002', 102),
(4, 'David', 'Jones', 65000, 'J002', 102),
(5, 'Eve', 'Davis', 70000, 'J003', 103),
(6, 'Frank', 'Wilson', 75000, 'J003', 103);

SELECT d.department_id, d.department_name
FROM departments_q15 d
JOIN employees_q15 e ON d.department_id = e.department_id
JOIN jobs_q15 j ON e.job_id = j.job_id
GROUP BY d.department_id, d.department_name
HAVING MIN(e.salary) > MIN(j.min_salary);
