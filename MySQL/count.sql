use customers;

select * from bank_employee;

show tables;

select count(*) from bank_employee;

select count(fname) from bank_employee;

select count(distinct desig) from bank_employee;

select count(distinct emp_id) from bank_employee where desig="Manager";