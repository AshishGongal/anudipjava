package second_Problem;

   //thread 1 of number in reverse order
public class NumThread1 extends Thread
{
	FibboNum fn;
	
	//parameterized constuctor using object of fibboNum
	public NumThread1(FibboNum fn) 
	{
		super();
		this.fn = fn;
	}

	@Override
	public void run() 
	{
		fn.revNumPrint(); //calling print reverse number method
		super.run();
	}

	

}
