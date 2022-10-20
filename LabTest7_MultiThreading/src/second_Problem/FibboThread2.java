package second_Problem;

//thread 2 of ffibbonecci series
public class FibboThread2 extends Thread
{
	FibboNum fn;

	//parameterized constuctor using object of fibboNum
	public FibboThread2(FibboNum fn) 
	{
		super();    
		this.fn = fn;
	}

	//override run method
	@Override
	public void run() 
	{
		fn.fibboSeriesPrint();//calling fibbonecci method
		super.run();
	}

	
}
