create or replace procedure UpdateEmployeeBonus ( bonus in number , department in varchar2 ) is
begin
update employees
set salary=salary+((salary/100)*bonus)
where department=department;
end;
/