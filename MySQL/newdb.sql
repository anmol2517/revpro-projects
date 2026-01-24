create database moneyview;

use moneyview;

CREATE TABLE rolepay (
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    designation VARCHAR(50),
    department VARCHAR(50),
    salary INT
);

select * from rolepay;

INSERT INTO rolepay (emp_id, first_name, last_name, designation, department, salary) VALUES
(201, 'Babu', 'Rao', 'Associate', 'Loan', 32000),
(202, 'Atmaram', 'Tuka Ram Bhide', 'Manager', 'Account', 48000),
(203, 'Jetha', 'Lal', 'Cashier', 'Cash', 30000),
(204, 'Ganpat', 'Rao', 'Accountant', 'Finance', 42000),
(205, 'Balu', 'Mafia', 'Clerk', 'Deposit', 28000),
(206, 'Bablu', 'Bisleri', 'Associate', 'Loan', 31000),
(207, 'Chandu', 'Chamkila', 'Manager', 'Sales', 50000),
(209, 'Paramdut', 'Swami', 'Clerk', 'Loan', 29000),
(210, 'Bhulla', 'Baman', 'Cashier', 'Support', 32000),
(211, 'Chinna Swami Mutra Swami', 'Ven Gopal Iyer', 'Deposit', 'Finance', 36000);