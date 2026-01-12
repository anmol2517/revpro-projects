SET SQL_SAFE_UPDATES = 0;


-- 1

CREATE DATABASE IF NOT EXISTS sales_db;


-- 2

USE sales_db;


-- 3

CREATE TABLE IF NOT EXISTS client_master ( 
customer_id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100) UNIQUE,
  city VARCHAR(50), status VARCHAR(20), created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- 4

CREATE TABLE IF NOT EXISTS products (
  product_id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), price DECIMAL(10,2) DEFAULT 0, stock INT DEFAULT 0, category_id INT
);


-- 5

CREATE TABLE IF NOT EXISTS employees (
  emp_id INT PRIMARY KEY, name VARCHAR(100), salary DECIMAL(10,2) CHECK (salary > 0), department VARCHAR(50),
  email VARCHAR(100), join_date DATE, manager_id INT
);


-- 6

CREATE TABLE IF NOT EXISTS orders (
  order_id INT AUTO_INCREMENT PRIMARY KEY, customer_id INT, product_id INT,
  order_date DATE, amount DECIMAL(10,2), status VARCHAR(20),
  FOREIGN KEY (customer_id) REFERENCES client_master(customer_id) ON DELETE CASCADE
);


-- 7

CREATE TABLE IF NOT EXISTS backup_customers AS SELECT * FROM client_master WHERE 1=0;


-- 8

CREATE TABLE IF NOT EXISTS departments (
  department_id INT AUTO_INCREMENT PRIMARY KEY, department_name VARCHAR(100)
);


-- 9

CREATE TABLE IF NOT EXISTS categories (
  category_id INT AUTO_INCREMENT PRIMARY KEY, category_name VARCHAR(100)
);


-- 10

CREATE TABLE IF NOT EXISTS accounts (
  acc_id INT PRIMARY KEY, customer_id INT, balance DECIMAL(10,2)
);


-- 11

CREATE TABLE IF NOT EXISTS order_logs (
  log_id INT AUTO_INCREMENT PRIMARY KEY, order_id INT,
  log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- 12

INSERT INTO client_master (name, email, city, status) VALUES
('Baburao','baburao@gmail.com','Pune','ACTIVE'), ('Jethalal','jethalal@gmail.com','Mumbai','ACTIVE'), 
('Ganpatrao','ganpatrao@gmail.com','Delhi','INACTIVE'), ('Bhide','bhide@gmail.com','Mumbai','ACTIVE'),
('Chandu','chandu@gmail.com','Delhi','ACTIVE');


-- 13

INSERT INTO products (name, price, stock) VALUES
('Laptop',50000,10), ('Mouse',500,50), ('Keyboard',1500,30);


-- 14

UPDATE employees SET salary = 60000 WHERE emp_id = 101;


-- 15

UPDATE products SET price = price * 1.10 WHERE product_id > 0;


-- 16

DELETE FROM client_master WHERE customer_id = 10;


-- 17

DELETE FROM client_master WHERE status = 'INACTIVE';


-- 18

INSERT INTO orders (customer_id, product_id, order_date, amount, status)
VALUES ((SELECT customer_id FROM client_master ORDER BY customer_id LIMIT 1),
  (SELECT product_id FROM products ORDER BY product_id LIMIT 1), CURDATE(), 2500, 'PENDING'
);


-- 19

UPDATE orders SET status = 'SHIPPED' WHERE order_id > 0;


-- 20

DELETE o FROM orders o JOIN (SELECT order_id FROM orders 
WHERE order_date < '2022-01-01') AS sub ON o.order_id = sub.order_id;



-- 21

CREATE TABLE IF NOT EXISTS backup_all AS SELECT * FROM client_master;


-- 22

SELECT * FROM client_master;


-- 23

SELECT name, email FROM client_master;


-- 24

SELECT * FROM employees WHERE salary > 50000;


-- 25

SELECT * FROM products ORDER BY price DESC;

-- 26

SELECT DISTINCT city FROM client_master;


-- 27

SELECT COUNT(*) AS total_customers FROM client_master;


-- 28

SELECT AVG(salary) AS avg_salary FROM employees;


-- 29

SELECT MAX(price) AS max_price FROM products;


-- 30

SELECT MIN(amount) AS min_order FROM orders;


-- 31

SELECT SUM(amount) AS total_sales FROM orders;


-- 32

SELECT department, COUNT(*) AS emp_count FROM employees GROUP BY department;


-- 33

SELECT department, AVG(salary) AS avg_salary FROM employees GROUP BY department;


-- 34

SELECT department FROM employees GROUP BY department HAVING COUNT(*) > 5;


-- 35

SELECT customer_id, SUM(amount) AS total_spent FROM orders GROUP BY customer_id;


-- 36

SELECT MONTH(order_date) AS month, SUM(amount) AS revenue FROM orders GROUP BY MONTH(order_date);


-- 37

SELECT * FROM employees WHERE join_date > '2021-12-31';


-- 38

SELECT * FROM orders WHERE order_date BETWEEN '2023-01-01' AND '2023-12-31';

-- 39
SELECT * FROM client_master WHERE city = 'Delhi';


-- 40
SELECT * FROM employees ORDER BY salary ASC;


-- 41

SELECT * FROM employees ORDER BY salary DESC LIMIT 5;


-- 42

SELECT * FROM products WHERE price BETWEEN 1000 AND 5000;


-- 43

SELECT * FROM client_master WHERE name LIKE 'A%';


-- 44

SELECT * FROM employees WHERE email LIKE '%hr%';


-- 45

SELECT * FROM orders WHERE status <> 'CANCELLED';


-- 46

SELECT * FROM client_master WHERE status IS NULL;


-- 47

SELECT c.name, o.order_id FROM client_master c INNER JOIN orders o ON c.customer_id = o.customer_id;


-- 48

SELECT c.name, o.order_id FROM client_master c LEFT JOIN orders o ON c.customer_id = o.customer_id;


-- 49

SELECT c.name, o.order_id FROM client_master c RIGHT JOIN orders o ON c.customer_id = o.customer_id;


-- 50

SELECT * FROM client_master CROSS JOIN products;


-- 51

SELECT * FROM employees WHERE salary > (SELECT AVG(salary) FROM employees);


-- 52

SELECT * FROM client_master 
WHERE customer_id IN ( SELECT customer_id FROM orders WHERE amount = (SELECT MAX(amount) FROM orders)
);


-- 53

SELECT * FROM products WHERE price > (SELECT AVG(price) FROM products);


-- 54

SELECT department  FROM employees GROUP BY department ORDER BY COUNT(*) DESC LIMIT 1;


-- 55

SELECT * FROM employees e WHERE salary > (SELECT salary FROM employees m WHERE e.manager_id = m.emp_id
);


-- 56

SELECT * FROM client_master WHERE customer_id NOT IN (SELECT customer_id FROM orders);


-- 57

SELECT * FROM orders WHERE amount > (SELECT AVG(amount) FROM orders);


-- 58

SELECT MAX(salary) AS second_highest_salary 
FROM employees WHERE salary < (SELECT MAX(salary) FROM employees);


-- 59

SELECT * FROM products WHERE product_id NOT IN (SELECT product_id FROM orders);


-- 60

SELECT * FROM employees 
WHERE department = (SELECT department FROM employees WHERE name = 'John');


-- 61

CREATE VIEW vw_active_customers AS SELECT * FROM client_master WHERE status = 'ACTIVE';


-- 62

CREATE VIEW vw_emp_details AS SELECT name, department, salary FROM employees;


-- 63

UPDATE vw_emp_details SET salary = 70000 WHERE name = 'Amit';


-- 64

DROP VIEW vw_emp_details;


-- 65

CREATE VIEW vw_monthly_sales AS SELECT MONTH(order_date) AS month, 
SUM(amount) AS total_sales FROM orders GROUP BY MONTH(order_date);


-- 66

CREATE INDEX idx_email ON client_master(email);


-- 67

CREATE INDEX idx_order_date_customer ON orders(order_date, customer_id);


-- 68

DROP INDEX idx_email ON client_master;


-- 69

SHOW INDEX FROM employees;


-- 70

EXPLAIN SELECT * FROM employees WHERE salary > 50000;


-- 71

DELIMITER $$
CREATE PROCEDURE add_customer(IN n VARCHAR(100), IN e VARCHAR(100), IN c VARCHAR(50))
BEGIN INSERT INTO client_master(name,email,city,status) VALUES(n,e,c,'ACTIVE'); 
END$$
DELIMITER ;


-- 72

DELIMITER $$
CREATE PROCEDURE get_employee(IN id INT) BEGIN SELECT * FROM employees WHERE emp_id=id;
END$$ DELIMITER ;


-- 73

DELIMITER $$
CREATE PROCEDURE total_sales(IN cid INT) BEGIN SELECT SUM(amount) AS total_sales FROM orders WHERE customer_id=cid;
END$$ DELIMITER ;


-- 74

DELIMITER $$
CREATE PROCEDURE update_salary(IN id INT, IN sal DECIMAL(10,2)) BEGIN 
UPDATE employees SET salary=sal WHERE emp_id=id;
END$$ DELIMITER ;


-- 75

CALL get_employee(101);


-- 76

DELIMITER $$
CREATE FUNCTION calc_gst(a DECIMAL(10,2)) RETURNS DECIMAL(10,2)
DETERMINISTIC NO SQL RETURN a*0.18;
$$
DELIMITER ;


-- 77

DELIMITER $$
CREATE FUNCTION emp_grade(s DECIMAL(10,2)) 
RETURNS VARCHAR(10) DETERMINISTIC NO SQL BEGIN RETURN IF(s>70000,'A',IF(s>40000,'B','C'));
END$$
DELIMITER ;


-- 78

SELECT name, emp_grade(salary) AS grade FROM employees;


-- 79

DROP FUNCTION emp_grade;


-- 80

CREATE TABLE IF NOT EXISTS order_logs2 (
  log_id INT AUTO_INCREMENT PRIMARY KEY, order_id INT, log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP);


-- 81

DELIMITER $$
CREATE TRIGGER trg_log_insert AFTER INSERT ON orders 
FOR EACH ROW BEGIN INSERT INTO order_logs2(order_id) VALUES(NEW.order_id);
END$$
DELIMITER ;


-- 82

DELIMITER $$
CREATE TRIGGER trg_salary_check BEFORE UPDATE ON employees 
FOR EACH ROW BEGIN IF NEW.salary < 30000 THEN SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT='Salary cannot be less than 30000';
  END IF;
END$$
DELIMITER ;


-- 83

DELIMITER $$
CREATE TRIGGER trg_stock_update AFTER INSERT ON orders FOR EACH ROW
BEGIN UPDATE products SET stock = stock - 1 WHERE product_id = NEW.product_id;
END$$
DELIMITER ;


-- 84

DELIMITER $$
CREATE TRIGGER trg_before_delete BEFORE DELETE ON client_master 
FOR EACH ROW BEGIN INSERT INTO backup_customers 
  SELECT * FROM client_master WHERE customer_id = OLD.customer_id;
END$$
DELIMITER ;


-- 85

DROP TRIGGER trg_log_insert;


-- 86

START TRANSACTION;
INSERT INTO orders(customer_id, product_id, amount, order_date, status) 
VALUES (1, 1, 2000, CURDATE(), 'PENDING'); 
COMMIT;


-- 87

START TRANSACTION;
INSERT INTO orders(customer_id, product_id, amount, order_date, status) 
VALUES (5, 3, 1500, CURDATE(),'PENDING');
ROLLBACK;


-- 88
-- SAVEPOINT sp1;


-- 89
-- ROLLBACK TO sp1;


-- 90

START TRANSACTION;
UPDATE accounts SET balance = balance - 1000 WHERE acc_id = 1;
UPDATE accounts SET balance = balance + 1000 WHERE acc_id = 2;
COMMIT;


-- 91

TRUNCATE TABLE orders;


-- 92

DROP TABLE IF EXISTS order_logs2;


-- 93

DROP VIEW IF EXISTS vw_active_customers;


-- 94

DROP PROCEDURE IF EXISTS add_customer;


-- 95

DROP FUNCTION IF EXISTS calc_gst;


-- 96

SHOW TABLES;


-- 97

SELECT NOW();


-- 98

SELECT DATABASE();


-- 99

SELECT USER();


-- 100

SELECT 'ALL 100 QUERIES EXECUTED SUCCESSFULLY' AS STATUS;


