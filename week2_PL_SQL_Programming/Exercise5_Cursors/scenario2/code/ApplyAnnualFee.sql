declare
cursor applyannualfee is select accountid from accounts;
id accounts.accountid%type;
begin
open applyannualfee;
loop
fetch applyannualfee into id;
exit when applyannualfee%notfound;
update accounts set balance=balance-100 where accountid=id;
end loop;
close applyannualfee;
end;
/
