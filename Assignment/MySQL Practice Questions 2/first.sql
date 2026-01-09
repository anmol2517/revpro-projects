CREATE DATABASE company_db_q1;
USE company_db_q1;

CREATE TABLE employees_q1 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(50),
    phone_number VARCHAR(20),
    hire_date DATE,
    job_id VARCHAR(10),
    salary DECIMAL(10,2),
    manager_id INT,
    department_id INT
);

CREATE TABLE departments_q1 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    location_id INT
);

CREATE TABLE locations_q1 (
    location_id INT PRIMARY KEY,
    city VARCHAR(50)
);

INSERT INTO locations_q1 VALUES
(1, 'New York'),
(2, 'London'),
(3, 'Tokyo');

INSERT INTO departments_q1 VALUES
(101, 'Sales', 1),
(102, 'Marketing', 2),
(103, 'Engineering', 3);

INSERT INTO employees_q1 VALUES
(1, 'John', 'Doe', 'john.doe@example.com', '1234567890', '2023-01-01', 'S001', 70000, NULL, 101),
(2, 'Jane', 'Smith', 'jane.smith@example.com', '2345678901', '2023-02-15', 'M002', 65000, 1, 102),
(3, 'Robert', 'Brown', 'robert.brown@example.com', '3456789012', '2023-03-10', 'E003', 80000, 1, NULL);

SELECT e.employee_id, e.first_name, e.last_name, e.salary, d.department_name, l.city
FROM employees_q1 e
LEFT JOIN departments_q1 d ON e.department_id = d.department_id
LEFT JOIN locations_q1 l ON d.location_id = l.location_id;
