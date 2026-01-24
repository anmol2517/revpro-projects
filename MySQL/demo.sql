CREATE TABLE employees (     
emp_id INT PRIMARY KEY,     
emp_name VARCHAR(50),     
joining_date DATE,     
last_login DATETIME 
);

select * from employees;

INSERT INTO employees (emp_id, emp_name, joining_date, last_login) VALUES 
(1, 'Atma Ram Tuka Ram Bhide', '2024-01-01', '2026-01-06 10:00:00'),
(2, 'JethaLal', '2023-06-15', '2026-01-05 18:30:00');

SELECT * FROM employees;
SELECT emp_name, joining_date FROM employees;

UPDATE employees
SET last_login = '2026-01-06 12:00:00'
WHERE emp_id = 1;

DELETE FROM employees
WHERE emp_id = 2;

ALTER TABLE employees
ADD salary DECIMAL(10,2);

ALTER TABLE employees
MODIFY emp_name VARCHAR(100);

ALTER TABLE employees
DROP COLUMN last_login;

TRUNCATE TABLE employees;
DROP TABLE employees;


