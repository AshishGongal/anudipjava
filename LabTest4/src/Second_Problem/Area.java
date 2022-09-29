package Second_Problem;

public class Area implements Shape {

	@Override
	public void RectangleArea(double lenght, double width)
	{
		System.out.printf("Area of Rectangle :" +(lenght*width));
        System.out.println("");
	}

	@Override
	public void SquareArea(double side) 
	{
		System.out.printf("Area of Square :" +(side*side));
        System.out.println("");
	}

	@Override
	public void CircleArea(double radius)
	{
		System.out.println("Area of Circle : "+(3.142*radius*radius));	
        System.out.println("");
	}

}
