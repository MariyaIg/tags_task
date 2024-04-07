drop table if exists Students;
create table if not exists Students (id serial primary key, F_name varchar(250), L_name varchar(250), score integer);

insert into Students (F_name, L_name, score) values ('Иванов', 'Иван', 50);
insert into Students  (F_name, L_name, score) values ('Петров', 'Николай', 90);
insert into Students  (F_name, L_name, score) values ('Лаптев', 'Евгений', 50);
insert into Students  (F_name, L_name, score) values ('Семенова', 'Арина', 90);
insert into Students  (F_name, L_name, score) values ('Лапшина', 'Евгения', 50);
insert into Students  (F_name, L_name, score) values ('Никитин', 'Семен', 65);
insert into Students  (F_name, L_name, score) values ('Зубарев', 'Петр', 50);
insert into Students  (F_name, L_name, score) values ('Соснова', 'Светлана', 65);
insert into Students  (F_name, L_name, score) values ('Стопорев', 'Александр', 40);
insert into Students  (F_name, L_name, score) values ('Петров', 'Василий', 70);
insert into Students  (F_name, L_name, score) values ('Егоров', 'Алексей', 75);
SELECT *from Students;
select score from Students group by score having count(score)>1;