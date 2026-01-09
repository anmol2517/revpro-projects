CREATE DATABASE company_db_q9;
USE company_db_q9;

CREATE TABLE departments_q9 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees_q9 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary DECIMAL(10,2),
    department_id INT
);

INSERT INTO departments_q9 VALUES
(401, 'Research'),
(402, 'Development'),
(403, 'Marketing');

INSERT INTO employees_q9 VALUES
(1, 'Alice', 'Green', 120000, 401),
(2, 'Bob', 'White', 100000, 401),
(3, 'Charlie', 'Black', 90000, 401),
(4, 'David', 'Gray', 80000, 402),
(5, 'Eva', 'Blue', 75000, 402),
(6, 'Frank', 'Red', 60000, 403);

SELECT d.department_id, d.department_name, SUM(e.salary) AS total_salary
FROM departments_q9 d
JOIN employees_q9 e ON d.department_id = e.department_id
GROUP BY d.department_id, d.department_name
HAVING SUM(e.salary) > 300000;
