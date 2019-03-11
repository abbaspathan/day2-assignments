
class Television{

	private boolean onTelevision;
	private double televisionVolume;
	private String televisionChannel;

	public Television(boolean onTelevision,double televisionVolume,String televisionChannel){

		this.onTelevision=onTelevision;
		this.televisionVolume=televisionVolume;
		this.televisionChannel=televisionChannel;
	}
	
	public double increaseVolume(double increase){

			this.televisionVolume=this.televisionVolume+increase;
			return this.televisionVolume;		
	}
	public double decreaseVolume(double decrease){
		if(televisionVolume>decrease){

			this.televisionVolume=this.televisionVolume-decrease;
		}
		else{
			this.televisionVolume=0.0;
		}
		
		return this.televisionVolume;		
	}
	public String changeChannel(String channel){

		this.televisionChannel=channel;
		return this.televisionChannel;
	}
	public boolean onOffChannel(boolean onTelevision){

		this.onTelevision=onTelevision;
		return this.onTelevision;
	}
}