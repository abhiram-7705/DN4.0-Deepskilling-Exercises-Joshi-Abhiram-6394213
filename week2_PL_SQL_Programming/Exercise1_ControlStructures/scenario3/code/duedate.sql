set serveroutput on;
begin
for c in (select c.customerid,c.name,l.enddate from customers c join loans l on c.customerid=l.customerid) loop
if c.enddate-sysdate<=30 then
dbms_output.put_line('customer '||c.name||' with id : '||c.customerid||' has loan due under 30 days');
end if;
end loop;
end;
/