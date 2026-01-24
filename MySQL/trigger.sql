DELIMITER $$
 
CREATE TRIGGER before_insert_emp
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
    SET NEW.resignation_date = NOW();
END$$
 
DELIMITER ;
 
-- INSERT INTO employees (id, name)
-- VALUES (1201, 'abc');
 
INSERT INTO employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id) VALUES (1201, 'Abc', 'zzz', 'a@gmail.com', '384938', CURDATE(), 'IT_PROG', 60000, 0.10, 103, 60);
 
 
SELECT * FROM employees; 
