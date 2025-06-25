create or replace procedure TransferFunds(sender in number, reciever in number,amount in number) is
balance customers.balance%type;
begin
select balance into balance from customers where customerid=sender;
if balance<amount then
dbms_output.put_line('insufficient funds to perform fund transfer');
else
update customers set balance=balance-amount where customerid=sender;
update customers set balance=balance+amount where customerid=reciever;
commit;
end if;
end;
/
