create or replace procedure AddNewCustomer(custid in number, custname in varchar2, dob in date, balance in number, isvip in varchar2) is
cust_count number;
customer_exists exception;
begin
select count(*) into cust_count from customers where customerid=custid;
if cust_count>0 then
raise customer_exists;
else
insert into customers values(custid,custname,dob,balance,sysdate,isvip);
commit;
end if;
exception
when customer_exists then
dbms_output.put_line('customer already exists with this id');
rollback;
end;
/
