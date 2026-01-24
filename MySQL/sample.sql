CREATE FUNCTION `new_function` ()
RETURNS INTEGER
BEGIN
select salary from employees where lastName = 'Smith';
RETURN 1;
END
