
public class Alternate 
{
	public static int printAlternetNo(int[]arr1) 
	{
		 
	        int total=0;
	        
	        System.out.println("Alternating number are" );

	        //loop through the array are incremented by 2
	        for (int i = 0; i < arr1.length; i = i+2) 
	        {  
	
				System.out.println(arr1[i]);//print alternating number
				
				total +=arr1[i];//Addition of Alternating Number
	        }  
			
	        return total;
	      
	}
	
	
	public static void main(String[] args) 
	{       //initialize array
	       int [] arr1 ={1, 2, 3, 4, 5,6,7,8,9,1};  

	       int total=printAlternetNo(arr1);
		System.out.print("Addition Of Alternating number :" +total);//final result
	}

}
