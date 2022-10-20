package second_Problem;

public class NumMain
 {  
	//main method
   public static void main(String args[])
   {  
	 FibboNum obj=new FibboNum();//object of fibbonum
	 
	 NumThread1 t1=new NumThread1(obj);  //thread 1
	 FibboThread2 t2=new FibboThread2(obj);//thread 2
     t1.start();  //start thread 1
     t2.start();  //start thread 2
   }  
}
