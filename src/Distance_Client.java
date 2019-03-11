import java.util.*;

public class Distance_Client{

	public static void main(String args[]){
	
		int feet=0;
		double inches=0.0;
		
		Scanner object=new Scanner(System.in);
		
		Distance object1=new Distance();

		System.out.println("Enter first distance in feet:");
		feet=object.nextInt();
		System.out.println("Enter first distance in inches:");
		inches=object.nextDouble();

		object1.setDistanceValue(feet,inches);

		Distance object2=new Distance();

		System.out.println("Enter second distance in feet:");
		feet=object.nextInt();
		System.out.println("Enter second distance in inches:");
		inches=object.nextDouble();

		object2.setDistanceValue(feet,inches);

		Distance object3=new Distance();

		object3.additionOfDistance(object1,object2);
		
		object1.displayDistanceValue();
		object2.displayDistanceValue();
		object3.displayDistanceValue();
	}
}