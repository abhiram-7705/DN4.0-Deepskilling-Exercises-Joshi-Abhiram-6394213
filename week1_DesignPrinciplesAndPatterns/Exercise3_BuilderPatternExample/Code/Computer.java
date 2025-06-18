public class Computer {
    
    private String CPU;
    private String RAM;
    private String storage;

    private int price;
    private String company;

    private Computer(ComputerBuilder computer)
    {
        this.CPU=computer.CPU;
        this.RAM=computer.RAM;
        this.storage=computer.storage;
        this.price=computer.price;
        this.company=computer.company;

        System.out.println("Computer model created");
    }

    public static class ComputerBuilder
    {
        private String CPU;
        private String RAM;
        private String storage;

        private int price;
        private String company;

        public ComputerBuilder(String cpu,String ram,String storage)
        {
            this.CPU=cpu;
            this.RAM=ram;
            this.storage=storage;
        }

        public ComputerBuilder setPrice(int price)
        {
            this.price=price;
            return this;
        }
        public ComputerBuilder setCompany(String company)
        {
            this.company=company;
            return this;
        }
        public Computer build()
        {
            return new Computer(this);
        }
    }
    public void displaySpecs()
    {
        System.out.println("CPU model    : "+CPU);
        System.out.println("RAM specs    : "+RAM);
        System.out.println("Storage type : "+storage);
        System.out.println("Price        : "+price);
        System.out.println("Company      : "+company);
    }
}
