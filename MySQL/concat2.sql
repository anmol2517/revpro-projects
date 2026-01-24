CREATE TABLE bank_employee (
    emp_id INT PRIMARY KEY,
    fname VARCHAR(50),
    lname VARCHAR(50),
    desig VARCHAR(50),
    dept VARCHAR(50)
);
use customers;
INSERT INTO bank_employee (emp_id, fname, lname, desig, dept) VALUES
(106, 'Raju', 'Rastogi', 'Manager', 'Loan'),
(107, 'Jetha', 'Lal', 'Cashier', 'Cash'),
(108, 'Aatma Ram', 'TukaRam Bhide', 'Associate', 'Loan'),
(109, 'Ganpat', 'Rao', 'Accountant', 'Account'),
(110, 'Ven Gopal', 'Iyer', 'Associate', 'Deposit');

select concat_ws(':', emp_id, fname, desig) from bank_employee;