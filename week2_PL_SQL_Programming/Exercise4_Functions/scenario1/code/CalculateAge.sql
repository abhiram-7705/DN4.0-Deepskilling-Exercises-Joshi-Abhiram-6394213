create or replace function CalculateAge ( dob in date ) return number
is
begin
return floor(months_between(sysdate,dob)/12);
end;
/