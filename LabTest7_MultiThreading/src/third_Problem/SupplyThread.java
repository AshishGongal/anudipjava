package third_Problem;

public class SupplyThread extends Thread
{
	private Producer p;
	
	public SupplyThread(Producer p) {
		super();
		this.p = p;
	}

	
	
	public SupplyThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupplyThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() 
	{
		p.supply(300);
		super.run();
	}

	
	
	

}
