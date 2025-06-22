public class Test {
    public static void main(String[] args) {

        OrderSort sort=new OrderSort();

        Order[] orders1={
            new Order(1, "abc", 300),
            new Order(2, "def", 150),
            new Order(3, "efg", 500),
            new Order(4, "xyz", 200)
        };
        System.out.println("Orders 1 :");
        sort.display(orders1);

        System.out.println("performing bubble sort");
        sort.bubbleSort(orders1);
        sort.display(orders1);

        Order[] orders2={
            new Order(1, "abc", 300),
            new Order(2, "def", 150),
            new Order(3, "efg", 500),
            new Order(4, "xyz", 200)
        };
        System.out.println("Orders 2 :");
        sort.display(orders2);
        
        System.out.println("performing quick sort");
        sort.quickSort(orders2,0,orders2.length-1);
        sort.display(orders2);
    }
}
