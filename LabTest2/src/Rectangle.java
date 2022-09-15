
public class Rectangle {
	int length;
	int width; 
	
	Rectangle()//default construct
	{
		length=31;
		width=11;
	}
	
	Rectangle(int length) //one default value
    { 
        this.length=length; 
        width=10; 
    } 
	
	
	Rectangle(int length,int width)//Parameterize Construct
	{
		this.length=length;
		this.width=width;
	}
	float GetData()
	{
		return(length*width);//Area of Rectangle = length*width
	}
	public static void main(String[] args) {
		 Rectangle Rect = new Rectangle();
		 Rectangle Rect1 = new Rectangle(30); 
		 Rectangle Rect2 = new Rectangle(20,70);
		 
		 System.out.println("Area of First Rectangle is : "+Rect.GetData()); 
         System.out.println("Area of Secons Rectangle is : "+Rect1.GetData());
         System.out.println("Area of Third Rectangle is : "+Rect2.GetData()); 
	}

}
