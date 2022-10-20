package second_Problem;

public class FibboNum 
{    
	
	//method to print 1-10 number in reverse order
	
	synchronized public void revNumPrint()
    {
		
	   System.out.println("\nNumbers in reverse order: ");
	   for(int i=10;i>0;i--)
	   {
       System.out.println(i);  
	   }
    }
	
	
	   
	//method to print 1-10 fibbonacci series
	synchronized public void fibboSeriesPrint() 
   {
	  int n1=0,n2=1;
		 System.out.println("\nFibonacci series :");
		 System.out.println(n1+"\n"+n2);
		 for(int i=2;i<10;i++)
		  {
			int n3=n1+n2;
			System.out.print("\n"+n3);
			n1=n2;
			n2=n3;
		  } 
   }
}
