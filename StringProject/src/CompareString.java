import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) 
	{
      Scanner scan=new Scanner(System.in);
      
	  System.out.println("Enter String 1 :");
      String s1=scan.nextLine();
      
	  System.out.println("Enter String 2 :");
      String s2=scan.nextLine();
    
      
      if(s1.compareTo(s2)>0) 
      {
    	  System.out.println("String 1 is bigger one :  "+s1);
      }
      else if(s2.compareTo(s1)>0) 
      {
    	  System.out.println("String 2 is bigger one :  "+s2);

      }
      else
      {
    	  System.out.println("Strings are equal");

       }
	}

}
