public class Test {
    public static void main(String[] args) {
        System.out.println("creating computer 1");

        Computer c1=new Computer.ComputerBuilder("intel i5", "8 GB", "512 SSD")
                                .setPrice(50000)
                                .setCompany("hp")
                                .build();
        System.out.println("Computer 1 created with following specs : ");
        c1.displaySpecs();

        System.out.println("\n\ncreating computer 2");
        Computer c2=new Computer.ComputerBuilder("intel i7", "16 GB", "512 SSD")
                                .setPrice(85000)
                                .setCompany("dell")
                                .build();
        System.out.println("Computer 2 created with following specs : ");
        c2.displaySpecs();
    }
}
