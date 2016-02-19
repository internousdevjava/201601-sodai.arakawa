drop database if exists login_test;
create database login_test;
use login_test;

create table test_table(
id varchar(255),
password varchar(255)
);

insert into test_table values("test","test");
insert into test_table values("test2","test2");