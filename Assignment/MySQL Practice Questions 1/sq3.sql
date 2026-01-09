CREATE DATABASE part3_db;
USE part3_db;

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
(37, 'HR', 50000);

INSERT INTO employees VALUES
('111', 'John', 'Smith', 14),
('222', 'Emma', 'Doe', 37),
('333', 'Liam', 'Brown', 14);

DELETE FROM employees;
