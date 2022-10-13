package third_Problem;


public class SumMain 
{

	public static void main(String[] args)
	{Sum s=new Sum();

	int[] a= {1,8,1,6};

	// a NullPointerException when passed a null
	try
    {
       s.sum(null,0,0);
    }
    catch(NullPointerException ne)
    {
       System.out.println("Please Enter Some Number "+ne);
    }	

	//ArrayIndexOutOfBoundsException when start and end not in range
	try
	{
		s.sum(a,0,0);
	}
	catch(ArrayIndexOutOfBoundsException aie)
	{
		System.out.println("Please enter valid range "+aie);
	}

	//Exception 
	try
	{
		if (s.sum(a,0,3)==0);

	}
	catch(IllegalArgumentException e)
	{
		System.out.println(e);
	}

	finally
	{
		System.out.println("Finally...");
	}

		
	}
}
