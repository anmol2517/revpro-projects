CREATE DATABASE company_db_q5;
USE company_db_q5;

CREATE TABLE departments_q5 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees_q5 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    department_id INT
);

INSERT INTO departments_q5 VALUES
(101, 'Sales'),
(102, 'Marketing');

INSERT INTO employees_q5 VALUES
(1, 'Emma', 'Johnson', 70000, 101),
(2, 'Liam', 'Smith', 50000, 101),
(3, 'Olivia', 'Brown', 60000, 102),
(4, 'Noah', 'Davis', 55000, 102);

SELECT e.*
FROM employees_q5 e
JOIN (
    SELECT department_id, AVG(salary) AS avg_salary
    FROM employees_q5
    GROUP BY department_id
) d_avg ON e.department_id = d_avg.department_id
WHERE e.salary > d_avg.avg_salary;
