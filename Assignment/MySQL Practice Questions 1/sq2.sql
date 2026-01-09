CREATE DATABASE part2_db;
USE part2_db;

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
(11, 'Marketing', 40000),
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
('666', 'Ava', 'Scott', 37),
('777', 'Mia', 'Clark', 77);


SELECT e.first_name, e.last_name, d.dept_name, d.budget
FROM employees e
JOIN departments d ON e.dept_code = d.dept_code;


SELECT e.first_name, e.last_name
FROM employees e
JOIN departments d ON e.dept_code = d.dept_code
WHERE d.budget > 60000;


SELECT *
FROM departments
WHERE budget > (SELECT AVG(budget) FROM departments);


SELECT d.dept_name
FROM departments d
JOIN employees e ON d.dept_code = e.dept_code
GROUP BY d.dept_name
HAVING COUNT(*) > 2;


SELECT e.first_name, e.last_name
FROM employees e
JOIN departments d ON e.dept_code = d.dept_code
WHERE d.budget = (
    SELECT MIN(budget)
    FROM departments
    WHERE budget > (SELECT MIN(budget) FROM departments)
);


INSERT INTO departments VALUES (11, 'Quality Assurance', 40000);
INSERT INTO employees VALUES ('847-21-9811', 'Mary', 'Moore', 11);


UPDATE departments
SET budget = budget * 0.9;


UPDATE employees
SET dept_code = 14
WHERE dept_code = 77;


DELETE FROM employees
WHERE dept_code = 14;


DELETE FROM employees
WHERE dept_code IN (
    SELECT dept_code
    FROM departments
    WHERE budget >= 60000
);
