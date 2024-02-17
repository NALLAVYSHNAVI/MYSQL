create table emp
(empno int(10),ename varchar(20),job varchar(20),mgr int(5),hiredate date,sal float(10),comm float(10),deptno int(5));
insert into emp VALUES 
(8369,'smith','clerk',8902,'1990-12-18',800.00,NULL,20),
(8499,'anya','salesman',8698,'1991-02-20',1600.00,300.00,30),
(8521,'seth','salesman',8698,'1991-02-22',1250.00,500.00,30),
(8566,'mahadevan','manager',8839,'1991-04-02',2985.00,NULL,20),
(8654,'momin','salesman',8698,'1991-09-28',1250.00,1400.00,30),
(8698,'bina','manager',8839,'1991-05-01',2850.00,NULL,30),
(8882,'shiavnsh','manager',8839,'1991-06-09',2450.00,NULL,10),
(8888,'scott','analyst',8566,'1992-12-09',3000.00,NULL,20),
(8839,'amir','president',NULL,'1991-11-18',5000.00,NULL,10),
(8844,'kuldeep','salesman',8698,'1991-09-08',1500.00,0.00,30);
SELECT ename, sal FROM emp WHERE sal >= 2200;
SELECT * FROM emp WHERE comm IS NULL;
SELECT ename, sal FROM emp WHERE sal < 2500 OR sal > 4000 OR sal IS NULL;
SELECT ename, job, sal FROM emp WHERE mgr IS NULL;
SELECT ename FROM emp WHERE SUBSTRING(ename, 3, 1) = 'A';
SELECT ename FROM emp WHERE SUBSTRING(ename, -1) = 'T';
create table employee
(employeecode int(10),employeename varchar(20),employeepage varchar(20),employeesal float(10));
insert into employee VALUES 
(101,'Jenny',25,10000),
(102,'Jacky',30,20000),
(103,'Joe',20,40000),
(104,'John',40,80000),
(105,'Shameer',25,90000);






    
    
    
    
