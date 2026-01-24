use moneyview;

select * from rolepay;

select department, count(emp_id) from rolepay group by department; 

select min(salary) from rolepay;

select department, sum(salary) from rolepay group by department; 

select department, count(emp_id) from rolepay group by department; 

select * from rolepay where salary = (select max(salary) from rolepay);