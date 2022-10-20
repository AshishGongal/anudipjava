package third_Problem;

public class Producer 
{
	private int availableProduct =200;
	
	//Demand method(Synchronized)
	synchronized public void demand(int n) 
	{
		System.out.println("available product are  "+availableProduct);
		// try block to catch exception
		try 
		{
		 if(n>availableProduct)//checkes for demand number is greater than availableproduct
			 
		//method get in waiting state untill demand no is not increased
	    //until other thread executed
		 wait();
		 availableProduct-=n;
		 System.out.println("available Product after demand"+availableProduct);
		
		} catch (InterruptedException e) 
		   {
			 e.printStackTrace();
		   }
		
	}
	
	//Supply method(Synchronized)
	synchronized public void  supply(int a) 
	{
		//supply incresing the product
		System.out.println("available  Product before supply "+availableProduct);
		availableProduct+=a;
		System.out.println("available  Product after supply "+availableProduct);
		 // notify which is used to communication between thread
		notify();
	
	}

}
