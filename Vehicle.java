
//general class
public class Vehicle{
	
	//attributes
	protected String vehicleName;
	protected String vehicleDesc;
	protected boolean hasEngine;
	protected int numberOfWheels;
	//method
	public int numberOfWheels() {
		int numberOfWheels = 0;
		return numberOfWheels;
	}
	public boolean hasEngine() {
			// TODO Auto-generated method stub
		return false;
	}
	//general layout
	public Vehicle() {
		this("???","???",false, 0);
	}
	//sets format
	public Vehicle(String name, String description, boolean engine, int wheels) {
		this.vehicleName = name;
		this.vehicleDesc = description;
		this.hasEngine = engine;
		this.numberOfWheels = wheels;
	}
	
	
}

