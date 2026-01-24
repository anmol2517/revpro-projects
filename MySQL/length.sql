use customers;

select * from bank_employee;

select char_length ('Ratan Tata');

select fname , char_length(fname) as length from bank_employee;

select * from bank_employee where char_length(fname) > 5;