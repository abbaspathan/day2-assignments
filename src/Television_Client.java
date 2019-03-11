import java.util.*;

public class Television_Client{

	public static void main(String args[]){

		double televisionVolume=0.0;
		String televisionChannel;
		String televisionState;
		boolean var=false;
		boolean var1=false;		

		Television object=new Television(false,0,"STAR PLUS");

		Scanner objectSc=new Scanner(System.in);
		System.out.println("Increase the volume by :");
		televisionVolume=objectSc.nextDouble();

		System.out.println("Current Volume is :"+object.increaseVolume(televisionVolume));

		System.out.println("Decrease the volume by :");
		televisionVolume=objectSc.nextDouble();

		System.out.println("Current Volume is :"+object.decreaseVolume(televisionVolume));

		System.out.println("Enter Channel Name :");
		objectSc.nextLine();
		televisionChannel=objectSc.nextLine();
	
		System.out.println("Current Channel is :"+object.changeChannel(televisionChannel));

		System.out.println("Enter: on/off");

		televisionState=objectSc.nextLine();

		if(televisionState.equals("on")){
			var=true;
		}
		else{
			var=false;
		}
	
		var1=object.onOffChannel(var);
		if(var1==true){
			System.out.println("Television Status : On");
		}
		else{
			System.out.println("Television Status : Off");
		}
	}
}