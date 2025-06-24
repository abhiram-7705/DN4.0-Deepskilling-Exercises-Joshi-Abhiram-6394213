begin
for c in (select customerid,balance from customers) loop
if c.balance>10000 then
update customers set isvip='Y' where customerid=c.customerid;
else
update customers set isvip='N' where customerid=c.customerid;
end if;
end loop;
end;
/