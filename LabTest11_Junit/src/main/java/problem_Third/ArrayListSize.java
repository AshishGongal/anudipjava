package problem_Third;

import java.util.ArrayList;

public class ArrayListSize
{
	public int size()
	{
		//Creating arraylist 
		ArrayList<String> list=new ArrayList<String>(); 
		
		//Adding object in arraylist
	      list.add("Ashish");    
	      list.add("Rohit");    
	      list.add("Lankesh");    
	      list.add("Abhishek");
	      list.add("Krishna");
		return list.size(); 
		
	}
	
	public boolean isEmpty()
	{
		//Creating arraylist 
		ArrayList<String> list=new ArrayList<String>(); 
		
		//Adding object in arraylist
	      list.add("Ashish");    
	      list.add("Rohit");    
	      list.add("Lankesh");    
	      list.add("Abhishek");
	      list.add("Krishna");
	      
		return list.isEmpty();
		
	}
}
