
class Time{

	private int hours;
	private int minutes;

	public void setTimeAndMinutes(int hours,int minutes){

		this.hours=hours;
		this.minutes=minutes;
	}

	public void showTimeAndMinutes(){

		System.out.println();
		System.out.println("Time is :"+this.hours+" hour "+this.minutes+" minute");
	}

	public void addTimeAndMinutes(Time object1,Time object2){

		this.hours=object1.hours+object2.hours;
		this.minutes=object1.minutes+object2.minutes;
	}
}