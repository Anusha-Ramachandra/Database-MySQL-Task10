# Database-MySQL-Task10
Creating database in Mysql and creating table adding, entries and checking queries and adding table employee details in JDBC and connecting to mysql



**Queries**
Consider the employee table and write SQL command to get the following.

A. Write a query to display EName and Sal of employees whose salary are greater than or equal to 2200?
	USE company;
	SELECT ename, sal FROM Empl WHERE sal >= 2200;

B. Write a query to display details of employees who are not getting commission?
	SELECT * FROM Empl WHERE comm IS NULL;

C. Write a query to display employee name and salary of those employees who don't have their salary in the range of 2500 to 4000?
	SELECT ename, sal FROM Empl WHERE sal NOT BETWEEN 2500 AND 4000;

D. Write a query to display the name, job title and salary of employees who don't have a manager?
	SELECT ename, job, sal FROM Empl WHERE mgr IS NULL;

E. display the name of an employee whose name contains "A" as third alphabet?
	SELECT ename FROM Empl WHERE ename LIKE '__A%';

F. display the name of an employee whose name contains "T" as the last alphabet?
	SELECT ename FROM Empl WHERE ename LIKE '%T';
