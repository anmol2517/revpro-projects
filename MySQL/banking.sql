use customers;

create table banking (acc_no int primary key auto_increment,
name varchar(58) not null, acc_type varchar (54) not null
default 'Savings');