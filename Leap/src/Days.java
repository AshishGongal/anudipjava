
public class Days {

	public static void main(String[] args) {
		String month="Feb";
		int year=2008;
		switch(month)
		{
		case "Jan","March","May","July","Aug","Oct","Dec"->System.out.println("Number of days = 31");
		case "April","Jun","Sept","Nov"->System.out.println("Number of days = 30");
		case "Feb"->{
			if(year%4==0)
		       System.out.println(year+" is Leap year and Number of days = 29");
		      
		      else
		       System.out.println("Number of days = 29");
		      
		    }
		default->System.out.println("invalid month");
		}

	}

}
