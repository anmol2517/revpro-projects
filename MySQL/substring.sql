use customers;

select substring('hello buddy', 1, 4);

select substring('hey man, what are you doing! everything good', 13, 23);

select substring('hello buddy, got the query', -9);

select * from bank_employee;

select substring(emp_id, 2) AS EmpID, fname from bank_employee;