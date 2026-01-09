CREATE DATABASE part1_db;
USE part1_db;

CREATE TABLE departments (
    dept_code INT PRIMARY KEY,
    dept_name VARCHAR(50),
    budget INT
);

CREATE TABLE employees (
    ssn VARCHAR(20) PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    dept_code INT,
    FOREIGN KEY (dept_code) REFERENCES departments(dept_code)
);

INSERT INTO departments VALUES
(14, 'IT', 80000),
(37, 'HR', 50000),
(77, 'Research', 120000),
(20, 'Sales', 60000);

INSERT INTO employees VALUES
('111', 'John', 'Smith', 14),
('222', 'Emma', 'Doe', 37),
('333', 'Liam', 'Brown', 14),
('444', 'Olivia', 'Smith', 77),
('555', 'Noah', 'Taylor', 20),
('666', 'Ava', 'Scott', 37);


SELECT last_name FROM employees;


SELECT DISTINCT last_name FROM employees;


SELECT * FROM employees WHERE last_name = 'Smith';


SELECT * FROM employees WHERE last_name IN ('Smith', 'Doe');


SELECT * FROM employees WHERE dept_code = 14;


SELECT * FROM employees WHERE dept_code IN (37, 77);


SELECT * FROM employees WHERE last_name LIKE 'S%';


SELECT SUM(budget) AS total_budget FROM departments;


SELECT dept_code, COUNT(*) AS total_employees
FROM employees
GROUP BY dept_code;


SELECT e.*, d.*
FROM employees e
JOIN departments d ON e.dept_code = d.dept_code;
