CREATE DATABASE company_db_q14;
USE company_db_q14;

CREATE TABLE regions_q14 (
    region_id INT PRIMARY KEY,
    region_name VARCHAR(50)
);

CREATE TABLE countries_q14 (
    country_id INT PRIMARY KEY,
    region_id INT
);

CREATE TABLE locations_q14 (
    location_id INT PRIMARY KEY,
    country_id INT
);

CREATE TABLE departments_q14 (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    location_id INT
);

CREATE TABLE employees_q14 (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT
);

CREATE TABLE job_history_q14 (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT
);

INSERT INTO regions_q14 VALUES
(1, 'North America'),
(2, 'Europe');

INSERT INTO countries_q14 VALUES
(1, 1),
(2, 1),
(3, 2);

INSERT INTO locations_q14 VALUES
(1, 1),
(2, 2),
(3, 3);

INSERT INTO departments_q14 VALUES
(101, 'Sales', 1),
(102, 'Marketing', 2),
(103, 'IT', 3);

INSERT INTO employees_q14 VALUES
(1, 'Alice', 'Miller', 101),
(2, 'Bob', 'Smith', 102),
(3, 'Charlie', 'Brown', 103);

INSERT INTO job_history_q14 VALUES
(1, '2021-01-01', '2021-12-31', 'J001', 102),  -- Alice also worked in Marketing
(1, '2022-01-01', '2022-12-31', 'J002', 101),
(2, '2021-01-01', '2021-12-31', 'J003', 102),
(3, '2022-01-01', '2022-12-31', 'J004', 103);

SELECT e.employee_id, e.first_name, e.last_name
FROM employees_q14 e
WHERE NOT EXISTS (
    SELECT d.department_id
    FROM departments_q14 d
    JOIN locations_q14 l ON d.location_id = l.location_id
    JOIN countries_q14 c ON l.country_id = c.country_id
    JOIN regions_q14 r ON c.region_id = r.region_id
    WHERE r.region_id = (
        SELECT r2.region_id
        FROM locations_q14 l2
        JOIN countries_q14 c2 ON l2.country_id = c2.country_id
        JOIN regions_q14 r2 ON c2.region_id = r2.region_id
        WHERE l2.location_id = e.department_id
    )
    AND d.department_id NOT IN (
        SELECT department_id
        FROM job_history_q14
        WHERE employee_id = e.employee_id
    )
);
