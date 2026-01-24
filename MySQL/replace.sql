use customers;

select * from bank_employee;

select replace('hey buddy', 'hey' , 'hello');

select replace('ABCDPQRMNO', 'PQR' , 'XYZ');

select replace(emp_id, 10, 1000) AS newEmpid, fname from bank_employee;

select replace(emp_id, 10, 'EMP') AS Ids, fname from bank_employee;