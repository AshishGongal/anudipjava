
public class Sum 
{
	public static void print_sums()
	{
		int nmb; //Number bet 1 to 100
        int total = 0;

        for(nmb= 1; nmb<= 100; nmb++)
        {
            total = total + nmb;
        }
        System.out.println("Sum of Num bet 1 to 100 is \n"+total);


    }
	public static void main(String[] args) {
		print_sums() ;
	}

}
