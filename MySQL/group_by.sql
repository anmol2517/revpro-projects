use customers;

select * from bank_employee;

select dept from bank_employee group by dept;

select dept, count(emp_id) from bank_employee group by dept;

select desig, count(emp_id) from bank_employee group by desig;
