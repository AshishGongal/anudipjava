package first_Problem;

public class MailMain 
{
    //main Method
	public static void main(String[] args) 
	{    
		CorrectMailId ml=new CorrectMailId();
		
		//calling validateEmail_id method in try catch block as it throws exception 

		try 
		{
		  CorrectMailId.validateEmail_id();
		}
		catch(InvalidMailException ime) 
		{
		  System.out.println(" Enter the valid Email Id " +ime);
		}
	}

}
