use moneyview;

select * from rolepay;

select emp_id, first_name, salary from rolepay where salary = (Select max(salary) from rolepay);