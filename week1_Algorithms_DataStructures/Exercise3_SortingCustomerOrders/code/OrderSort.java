public class OrderSort {

    public void display(Order orders[])
    {
        System.out.println("array after sorting");
        for(Order ord:orders)
        {
            System.out.println(ord.toString());
        }
    }
    public void bubbleSort(Order orders[])
    {
        boolean swap;
        Order order;
        for(int i=0;i<orders.length-1;i++)
        {
            swap=false;
            for(int j=0;j<orders.length-i-1;j++)
            {
                if(orders[j].getPrice()>orders[j+1].getPrice())
                {
                    swap=true;
                    order=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=order;
                }
            }
            if(swap==false)
            {
                break;
            }
        }

    }
    public void quickSort(Order[] orders, int low, int high) {
        if (low<high) {
            int pi=partition(orders,low,high);
            quickSort(orders,low,pi-1);
            quickSort(orders,pi+1,high);
        }

    }
    private int partition(Order[] orders,int low,int high) {
        double pivot=orders[high].getPrice();
        int i=(low-1);

        for (int j=low;j<high;j++) {
            if (orders[j].getPrice()<=pivot) {
                i++;
                Order temp=orders[i];
                orders[i]=orders[j];
                orders[j]=temp;
            }
        }
        Order temp=orders[i+1];
        orders[i+1]=orders[high];
        orders[high]=temp;
        return i+1;
    }

}
