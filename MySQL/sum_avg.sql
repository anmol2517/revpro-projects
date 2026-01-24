use moneyview;

select * from rolepay;

select sum(salary) from rolepay;

select avg(salary) from rolepay;

select department, sum(salary) from rolepay group by department; 

select department, count(emp_id), sum(salary) from rolepay group by department; 