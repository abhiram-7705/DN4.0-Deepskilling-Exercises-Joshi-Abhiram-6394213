public class Finance {

    public static double calculate(double p,double rate,int years)
    {
        if(years==0)
        return p;
        return calculate(p*(1+rate), rate, years-1);

    }
    public static void main(String[] args) {
        System.out.println("Predicting the future values using the compound interest formula");
        double initial=10000;
        double rate=0.75;
        int years=10;

        System.out.println("the current value is : "+initial);
        System.out.println("after "+years+" years with a rate : "+rate+"% the amount will be "+calculate(initial,rate,years));
    }
}