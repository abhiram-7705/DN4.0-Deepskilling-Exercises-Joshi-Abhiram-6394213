declare
cursor updateloaninterestrates is select loanid from loans;
id loans.loanid%type;
begin
open updateloaninterestrates;
loop
fetch updateloaninterestrates into id;
exit when updateloaninterestrates%notfound;
update loans set interestrate=interestrate+2 where loanid=id;
end loop;
close updateloaninterestrates;
end;
/
