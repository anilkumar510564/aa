use comp;

create table employee(empno int(20),
ename varchar(30),
job varchar(30),
hiredate varchar(40),
mgr int(20),
sal int(50),
comm int(40),
deptno varchar(30));

insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7369,"smith","clerk","17-dec-80",7902,800,null ,20);
select * from employee;

insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7499,"allen","salesman","20-feb-81",7698,1600,300 ,30);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7521,"ward","salesman","22-feb-81",7698,1250 ,500,30);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7566,"jones","manager","02-apr-81",7839,2975,null ,20);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7654,"martin","salesman","28-sep-81",7698,1250,1400 ,30);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7698,"blake","manager","01-may-81",7839,2850,null ,30);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7782,"clark","manager","09-jun-81",7939,2450,null ,10);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7788,"scott","analyst","19-apr-87",7566,3000,null ,20);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7839,"king","president","17-nov-81",null,5000,null ,10);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7844,"turner","salesman","08-sep-81",7698,1500,0,30);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7876,"adams","clerk","23-may-87",7788,1100,null ,20);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7900,"james","clerk","03-dec-81",7698,950,null,30);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7902,"ford","analyst","03-dec-81",7566,3000,null ,20);
insert into employee(empno,ename,job,hiredate,mgr,sal,comm,deptno) 
values(7934,"miller","clerk","23-jan-82",7782,1300 ,null,10);

select * from employee where deptno=30;
select employee.ename,employee.deptno,employee.empno 
from employee where job="clerk";

select employee.empno,employee.ename from employee where employee.deptno>20;
select * from employee where comm>sal;

select * from employee where comm>0.6*sal;

select employee.ename,employee.job,employee.sal from employee 
where employee.deptno=20 and employee.sal>2000;

select * from employee where employee.job="salesman" and employee.deptno=30 and employee.sal=1500;

select * from employee where employee.job="manager" or employee.job="president";

select * from employee where employee.job="manager" and  not employee.deptno=30;
select * from employee where employee.deptno=10 and employee.job="manager" or employee.job="clerk";
select * from employee where employee.job="manager" or employee.job="clerk" and employee.deptno=20;
select * from employee where employee.job="manager" and  employee.deptno=10 
or employee.job="clerk" and employee.deptno=20 and
 not employee.job="manager" or not employee.job="clerk" and employee.sal>=2000;
 select * from employee where  employee.deptno=20 and not employee.job="manager" and not
 employee.job="clerk" ; 
 select * from employee where employee.sal between 1200 and 1400;
 select * from employee where employee.job="clerk" or employee.job="analyst" or employee.job="salesman";
 select * from employee where not (employee.job="clerk" or employee.job="analyst" or employee.job="salesman");
 select * from employee where employee.comm is null or employee.comm=0;
 select distinct employee.job from employee ;
 select * from employee where employee.comm="null" or employee.comm<100;
 select  * from employee where employee.sal>2000;
 select * from employee where employee.ename like 'm%' or employee.ename='%m';
 select * from employee where  employee.ename like '%m%';
 select * from employee where length(employee.ename)<=15 and employee.ename like '__r%';
 select * from employee where employee.hiredate like '%feb%';
 select * from employee where employee.hiredate like '%30%' or employee.hiredate like '%31%';
 select * from employee where employee.hiredate like "%2003%";
 select employee.ename+' '+employee.job from employee;
 select * from employee order by employee.ename;
 select * from employee order by employee.ename desc;
 select employee.ename,employee.job,employee.sal from employee order by employee.job and employee.sal  ;
 
 
 
 
 


