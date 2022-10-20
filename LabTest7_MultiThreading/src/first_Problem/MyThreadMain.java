package first_Problem;

public class MyThreadMain //main class
{
        //main method
	public static void main(String[] args)
	{


        MyThread t1 = new MyThread();//thread 1
        MyThread t2 = new MyThread();//thread 2
        MyThread t3 = new MyThread();//thread 3
        
        t1.start();//start thread 1
        t2.start();//start thread 1
        t3.start();//start thread 1
	}

}
