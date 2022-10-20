package third_Problem;

public class ProducerMain
{

	public static void main(String[] args)
	{
		Producer p=new Producer();
		SupplyThread spt=new SupplyThread(p);//supply thread
		DemandThread dmd=new DemandThread(p);//demand thread
		
		dmd.start(); //Starting demand thread
		spt.start();//starting supply thread
	}

}
