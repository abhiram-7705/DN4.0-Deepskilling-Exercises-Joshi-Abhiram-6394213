declare
cursor generatemonthlystatements is
select c.customerid
from customers c
join accounts a on c.customerid = a.customerid
join transactions t on a.accountid = t.accountid
where trunc(t.transactiondate, 'mm') = trunc(sysdate, 'mm');
cid customers.customerid%type;
begin
open generatemonthlystatements;
loop
fetch generatemonthlystatements into cid;
exit when generatemonthlystatements%notfound;
dbms_output.put_line('statement for customer with id : ' || cid || ' is generated');
end loop;
close generatemonthlystatements;
end;
/
