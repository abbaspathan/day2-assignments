import java.util.*;

public class Time_Client{

	public static void main(String args[]){

		int hours=0;
		int minutes=0;
		
		Scanner object=new Scanner(System.in);
		
		Time object1=new Time();

		System.out.println("Enter hours :");
		hours=object.nextInt();
		System.out.println("Enter minutes:");
		minutes=object.nextInt();

		object1.setTimeAndMinutes(hours,minutes);

		Time object2=new Time();

		System.out.println("Enter hours :");
		hours=object.nextInt();
		System.out.println("Enter minutes:");
		minutes=object.nextInt();

		object2.setTimeAndMinutes(hours,minutes);

		Time object3=new Time();

		object3.addTimeAndMinutes(object1,object2);
		
		object1.showTimeAndMinutes();
		object2.showTimeAndMinutes();
		object3.showTimeAndMinutes();
	}
}