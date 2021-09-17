create table school.students (regd_no int(30) primary key not null,
stu_name varchar(40),
branch varchar(35));

insert into school.students(regd_no,stu_name,branch)
value(100,'ram','CSE');

insert into school.students(regd_no,stu_name,branch)
value(200,'hari','mech');

insert into school.students(regd_no,stu_name,branch)
value(300,'pradeep','eee');

insert into school.students(regd_no,stu_name,branch)
value(400,'deepak','etc');

select school.students.regd_no from school.students 
where school.students.stu_name="pradeep";

select school.students.stu_name,school.students.branch 
from school.students;

select count(*) as no_rows from school.students;

alter table school.students add address varchar(30);


