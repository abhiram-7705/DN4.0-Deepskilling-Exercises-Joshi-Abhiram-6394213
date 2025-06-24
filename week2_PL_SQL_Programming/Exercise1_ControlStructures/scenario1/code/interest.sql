begin
for c in (select customerid from customers where floor(months_between(sysdate,dob)/12)>60) loop
update loans
set interestrate=interestrate-1
where customerid=c.customerid;
end loop;
end;
/