
USE school_db;

DROP TABLE IF EXISTS school_db;

CREATE TABLE school_db (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    class INT
);


INSERT INTO school_db (id, name, class)
VALUES 
(111, "Sanghmitra", 12),
(222, "D.A.V", 10),
(333, "M.S.S.M", 8),
(444, "Gurukul");

SELECT * FROM school_db;

delete from school_db
where id = 222;

select * from school_db;

