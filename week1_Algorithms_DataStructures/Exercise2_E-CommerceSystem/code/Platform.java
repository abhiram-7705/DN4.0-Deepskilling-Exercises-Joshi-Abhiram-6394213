public class Platform {
    
    boolean found;
    public void linearSearch(int id,Product products[])
    {
        found=false;
        for(Product p:products)
        {
            if(p.getID()==id)
            {
                found=true;
                System.out.println("found the product with id : "+id);
                break;
            }
        }
        if(found==false)
        {
            System.out.println("cannot find the product with id : "+id);
        }
    }

    public void binarySearch(int id,Product products[])
    {
        found=false;
        int left=0;
        int right=products.length-1;

        int mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(products[mid].getID()==id)
            {
                System.out.println("product found with id : "+id);
                found=true;
                break;
            }
            if(products[mid].getID()>id)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        if(found==false)
        {
            System.out.println("cannot find product with id : "+id);
        }
    }

}
