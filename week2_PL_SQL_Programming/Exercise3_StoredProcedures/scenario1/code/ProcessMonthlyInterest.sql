create or replace procedure ProcessMonthlyInterest is
begin
update accounts
set balance=balance+(balance*0.01)
where accountType='Savings';
commit;
end;
/
