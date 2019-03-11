
class Distance{
	
	private int feet;
	private double inches;

	public void setDistanceValue(int feet,double inches){
		
		this.feet=feet;
		this.inches=inches;
	}
	
	public void displayDistanceValue(){

		System.out.println();
		System.out.println("Distance is :"+this.feet+"feet "+this.inches+"inch");		
	}

	public void additionOfDistance(Distance object1,Distance object2){
		
		this.feet=object1.feet+object2.feet;
		this.inches=object1.inches+object2.inches;
	}
}