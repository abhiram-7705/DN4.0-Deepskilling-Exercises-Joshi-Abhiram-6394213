create or replace procedure SafeTransferFunds(sender in number, reciever in number,amount in number) IS
balance customers.balance%type;
insufficient_funds exception;
begin
select balance into balance from customers where customerid=sender;
if balance<amount then
raise insufficient_funds;
else
update customers set balance=balance-amount where customerid=sender;
update customers set balance=balance+amount where customerid=reciever;
commit;
end if;
Exception
when insufficient_funds then
dbms_output.put_line('insufficient funds to perform fund transfer');
rollback;
when others then
dbms_output.put_line('an error occured');
end;
/
