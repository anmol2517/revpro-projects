SELECT CONCAT('hey', 'buddy');

USE customers;

SELECT * FROM employees;

SELECT name AS fname FROM employees;

ALTER TABLE employees RENAME COLUMN name TO fname;

ALTER TABLE employees ADD COLUMN lname VARCHAR(255) AFTER fname;

UPDATE employees SET lname = 'Doe' WHERE emp_id = 101;
UPDATE employees SET lname = 'Dane' WHERE emp_id = 103;
UPDATE employees SET lname = 'Deff' WHERE emp_id = 104;

SELECT * FROM employees;
