create or replace procedure UpdateSalary ( empid in number, percentage in number) is
employee_notfound exception;
emp_count number;
begin
select count(*) into emp_count from employees where employeeid=empid;
if emp_count=0 then
raise employee_notfound;
else
update employees set salary=salary+((salary/100)*percentage) where employeeid=empid;
commit;
end if;
exception
when employee_notfound then
dbms_output.put_line('employee not found');
rollback;
end;
/
