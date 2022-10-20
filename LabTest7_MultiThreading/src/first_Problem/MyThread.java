package first_Problem;

//class MyThread extending it with thread class
public class MyThread extends Thread
{

	public MyThread()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public MyThread(String name) 
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	//Overrided run method 
	@Override
	public void run() 
	{

		String [] friends = {"Ashu","Ak","Rohit","Lankesh","Krisha","Abhay","Abhi","Jay","Bunty","Sager"};
		//for each loop to print name
		for(String friend:friends)
		{
			System.out.println(friend);
		}
		super.run();
	}

	
}
