import java.util.*;
public class Rectangle_Client{
	public static void main(String args[]){
		
		float rectangleWidth=0.0f;
		float rectangleLength=0.0f;

		Scanner objectSc=new Scanner(System.in);

		System.out.println("Enter the length in 'cm' :");
		rectangleWidth=objectSc.nextFloat();
		System.out.println("Enter the width in 'cm' :");
		rectangleLength=objectSc.nextFloat();

		Rectangle object=new Rectangle(rectangleLength,rectangleWidth);
		
		System.out.println("Area of rectangle is:"+object.getArea());
		System.out.println("Diagonal of rectangle is:"+object.getDiagonal());
		System.out.println("Perimeter of rectangle is:"+object.getPerimeter());
	}
	
}