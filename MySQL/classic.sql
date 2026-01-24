use classicmodels;

CREATE TABLE job_history (
    employee_id INT,
    start_date DATE,
    end_date DATE,
    job_id VARCHAR(10),
    department_id INT,
    PRIMARY KEY (employee_id, start_date)
);

select * from employees;
create index idx_name on employees(first_name);
select * from employees;
create index idx_name on employees(first_name);
show index from employees;

