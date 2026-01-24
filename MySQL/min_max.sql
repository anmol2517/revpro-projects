use moneyview;

select * from rolepay;

select max(salary) from rolepay;

select min(salary) from rolepay;

SELECT first_name, salary
FROM rolepay
ORDER BY salary DESC
LIMIT 1;

SELECT first_name, MAX(salary)
FROM rolepay
GROUP BY first_name;