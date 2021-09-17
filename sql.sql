use nation;


create table nation.countries (country_id char(30)  not null primary key, 
country_name varchar(30),
region_id int(30) unsigned not null);
create table nation.regions (region_id int(30) primary key,
region_name varchar(30));

create table nation.locations (locations_id int(30) unsigned not null auto_increment primary key,
 street_address varchar(70),postal_cod varchar(8),
 city varchar(30) not null,
 state_province varchar(20),
 country_id char(30) not null);
 
 create table nation.departments (department_id int(30) unsigned not null
primary key, 
department_name varchar(30) not null, 
manager_id int(40)  unsigned,
location_id int(40) unsigned);

create table  nation.regions (region_id int(30) unsigned  not null primary key , 
region_name varchar(30));

create table nation.jobs (job_id varchar(30)  not null primary key,
 job_title varchar(30) not null, 
 min_salary decimal(20,5) unsigned,
 max_salary decimal(20,5) unsigned);
 
 create table nation.employees (emplyee_id int(30) unsigned not null primary key,
 first_name varchar(30),
 last_name varchar(30) not null,
 email varchar(40) not null, 
 phone_number varchar(10),
 hire_date date not null,
 job_id varchar(30) not null,
 salary decimal(20,4) not null,
commission_pct decimal,
manager_id int(40) unsigned, 
department_id int(40) unsigned);

create table nation.job_history (employee_id int  unsigned  not null, 
start_date date  not null,
 end_date date not null,
 job_id varchar(40) not null,
 department_id int(40) unsigned not null);


ALTER TABLE nation.countries
ADD COLUMN columnname INT DEFAULT(1),
ADD FOREIGN KEY (region_id) REFERENCES nation.regions(region_id) ON DELETE CASCADE;

alter table nation.departments rename column location_id to locations_id;

alter table departments add unique index(manager_id);

 





alter table nation.locations add foreign key (country_id)  references nation.countries(country_id);

alter table nation.departments add foreign key (locations_id)  references nation.locations(locations_id);



alter table nation.employees add foreign key (job_id)  references nation.jobs(job_id),
add foreign key (department_id)  references nation.departments(department_id);

alter table nation.job_history add foreign key (job_id)  references nation.jobs(job_id),
add foreign key(department_id) references nation.departments(department_id); 
alter table nation.job_history add foreign key (employee_id) references nation.employees(employee_id);

alter table nation.employees add foreign key(manager_id) references nation.departments(manager_id);
drop table nation.countries;
create table nation.countries (country_id varchar(30) not null primary key, country_name varchar(40),region_id int(40) not null);
 

alter table nation.countries add foreign key(region_id) references nation.regions(region_id); 
alter table nation.countries add foreign key(region_id) references nation.regions(region_id);
alter table nation.job_history add primary key(start_date);
alter table nation.job_history add unique index(employee_id);
alter table nation.job_history add primary key(employee_id);




alter table nation.employees rename column employee to employee_id;


 drop table nation.job_history;
 
 insert into nation.countries (country_id,country_name,region_id) values (1,"india",101);
 insert into nation.countries (country_id,country_name,region_id) values (2,"china",102);
 insert into nation.countries (country_id,country_name,region_id) values (3,"ban",103);
 insert into nation.countries (country_id,country_name,region_id) values (4,"pak",104);
 insert into nation.countries (country_id,country_name,region_id) values (5,"ame",105);
 
 insert into nation.regions(region_id,region_name) values (101,"abbcc");
 insert into nation.regions(region_id,region_name) values (102,"ab");
  insert into nation.regions(region_id,region_name) values (103,"abd");
   insert into nation.regions(region_id,region_name) values (104,"abcd");
    insert into nation.regions(region_id,region_name) values (105,"abcde");
    
 insert into nation.locations (locations_id,street_address,postal_cod,city,state_province,country_id) values(12345,"assam",123456,"beng","karn",1);
  insert into nation.locations (locations_id,street_address,postal_cod,city,state_province,country_id) values(1234566,"assammm",1234564,"bengal","karnata",2);
   insert into nation.locations (locations_id,street_address,postal_cod,city,state_province,country_id) values(12345667,"assammme",12345647,"bengali","karnatak",3);
    insert into nation.locations (locations_id,street_address,postal_cod,city,state_province,country_id) values(12345668,"assammmem",12345648,"bengalo","karnataka",4);
     insert into nation.locations (locations_id,street_address,postal_cod,city,state_province,country_id) values(12345669,"assammmmem",12345649,"bengalp","karna",5);
     
  insert into nation.departments (department_id,department_name,manager_id,locations_id) values (321,"xyxx",456,12345);
  insert into nation.departments (department_id,department_name,manager_id,locations_id) values (322,"xyxxx",4568,12345667);
  insert into nation.departments (department_id,department_name,manager_id,locations_id) values (323,"xyxx",4569,12345668);
  insert into nation.departments (department_id,department_name,manager_id,locations_id) values (324,"xyxvv",4560,12345668);
  insert into nation.departments (department_id,department_name,manager_id,locations_id) values (3213,"xyxx",4567,12345669);
  
  
  insert into nation.jobs (job_id,job_title,min_salary,max_salary) values (2314,"xqwe",12000,114000);
  insert into nation.jobs (job_id,job_title,min_salary,max_salary) values (231454,"xqwert",1200012,11400033);
  insert into nation.jobs (job_id,job_title,min_salary,max_salary) values (231421,"xqwety",12000,114000);
  insert into nation.jobs (job_id,job_title,min_salary,max_salary) values (231422,"xqweer",12000,114000);
  insert into nation.jobs (job_id,job_title,min_salary,max_salary) values (231423,"xqweee",12000,114000);
  
  
  insert into nation.employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,
  commission_pct,manager_id,department_id) values (12312,"anil","kumar","anil@",7022,"1999-09-12",2314,1243003,12.2334,456,321);
  insert into nation.employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,
  commission_pct,manager_id,department_id) values (123121,"anil","kumar","anil@",7022,"1999-09-12",231454,1243003,12.2334,4567,3213);
   insert into nation.employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,
  commission_pct,manager_id,department_id) values (123122,"aniaal","kumssar","anil@",7022,"1999-09-12",231421,1243003,12.2334,4568,32133);
   insert into nation.employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,
  commission_pct,manager_id,department_id) values (123123,"aniler","kumarer","anil@",7022,"1999-09-12",231422,1243003,12.2334,4569,32144);
   insert into nation.employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,
  commission_pct,manager_id,department_id) values (123124,"anilan","kumaran","anil@",7022,"1999-09-12",231423,1243003,12.2334,4565,32155);
  
  insert into nation.job_history(employee_id,start_date,end_date,job_id,department_id) values(12312,"1999-01-23","1999-01-19",2314,321);
  insert into nation.job_history(employee_id,start_date,end_date,job_id,department_id) values(123121,"2000-01-23","1999-01-19",231454,3213);
  insert into nation.job_history(employee_id,start_date,end_date,job_id,department_id) values(123122,"2001-01-23","1999-01-19",231421,32133);
  insert into nation.job_history(employee_id,start_date,end_date,job_id,department_id) values(123123,"2002-01-23","1999-01-19",231422,321344);
  insert into nation.job_history(employee_id,start_date,end_date,job_id,department_id) values(123124,"2003-01-23","1999-01-19",231423,321355);
  
  set foreign_key_checks=0;
  alter table nation.job_history drop primary key,add primary key(employee_id,start_date);

commit;
 

