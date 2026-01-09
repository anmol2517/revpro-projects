CREATE DATABASE company_db_q6;
USE company_db_q6;

CREATE TABLE departments_q6 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees_q6 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    department_id INT
);

INSERT INTO departments_q6 VALUES
(201, 'Finance'),
(202, 'IT');

INSERT INTO employees_q6 VALUES
(1, 'Sophia', 'Taylor', 80000, 201),
(2, 'James', 'Anderson', 75000, 201),
(3, 'Mia', 'Thomas', 90000, 202),
(4, 'Lucas', 'Martin', 85000, 202);

SELECT e.employee_id, e.first_name, e.last_name, e.salary, d.department_name
FROM employees_q6 e
JOIN departments_q6 d ON e.department_id = d.department_id
WHERE (e.department_id, e.salary) IN (
    SELECT department_id, MAX(salary)
    FROM employees_q6
    GROUP BY department_id
);
