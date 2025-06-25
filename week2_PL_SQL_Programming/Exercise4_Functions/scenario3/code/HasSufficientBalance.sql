create or replace function HasSufficientBalance (id in number, amount in number) return boolean
is
balance accounts.balance%type;
begin
select balance into balance from accounts where accountid=id;
if amountbalance then
return true;
else
return false;
end if;
end;
/  