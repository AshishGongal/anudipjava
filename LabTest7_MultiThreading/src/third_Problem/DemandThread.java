package third_Problem;

//Demand thread
public class DemandThread extends Thread
{
	private Producer p;
	
	
	public DemandThread(Producer p) {
		super();
		this.p = p;
	}

	public DemandThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void run()
	{
		p.demand(300);
		super.run();
	}
	
}
