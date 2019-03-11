import java.util.*;

public class Complex_Client{
	
	public static void main(String args[]){
		
		double realNumber=0.0;
		double imaginaryNumber=0.0;
		
		Scanner object=new Scanner(System.in);
		
		Complex object1=new Complex();

		System.out.println("Enter first real number:");
		realNumber=object.nextDouble();
		System.out.println("Enter first imaginary number:");
		imaginaryNumber=object.nextDouble();

		object1.setValues(realNumber,imaginaryNumber);

		Complex object2=new Complex();

		System.out.println("Enter second real number:");
		realNumber=object.nextDouble();
		System.out.println("Enter second imaginary number:");
		imaginaryNumber=object.nextDouble();

		object2.setValues(realNumber,imaginaryNumber);

		Complex object3=new Complex();

		object3.summation(object1,object2);

		object1.displayComplexNumber();
		object2.displayComplexNumber();
		object3.displayComplexNumber();
		
	}
}