use customers;

select * from bank_employee;

Alter table bank_employee add column salary int not null default 28000;

select * from bank_employee limit 5;

select * from bank_employee limit 3 , 8;