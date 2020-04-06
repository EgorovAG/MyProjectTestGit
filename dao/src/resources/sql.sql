create table user (
id int(64) auto_increment PRIMARY KEY,
login varchar(50) not null ,
password varchar(50) not null
);

insert into user (login, password)
VALUES ('admin', 'admin');
