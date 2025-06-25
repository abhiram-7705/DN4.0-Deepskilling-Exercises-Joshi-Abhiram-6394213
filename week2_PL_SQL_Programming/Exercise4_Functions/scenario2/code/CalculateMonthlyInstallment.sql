create or replace function CalculateMonthlyInstallment(p in number,r in number,y in number) return number
is
rmonthly number;
months number;
begin
rmonthly:=(r/1200);
months:=y*12;
return p*rmonthly/(1-POWER(1+rmonthly,-months));
end;
/