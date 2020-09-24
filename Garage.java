import java.util.ArrayList;

public class Garage {

private ArrayList<Vehicle> GarageList= new ArrayList<Vehicle>();

public void addVehicle(Vehicle vehicle){
	GarageList.add(vehicle);
	
}
public void calculateBill() {
//costlist 
	int carbasecost = 200;
	int bicyclebasecost = 50;
	int motorcyclebasecost = 100;
	int enginecost = 200;
	int costperwheel = 30;
	int costroadbike = 20;
	int costsuperbike = 50;
	int costperdoor = 10;
	for (Vehicle obj : GarageList) {
		if (obj instanceof Car) {
			Car target = (Car) obj;
			int totalcost = carbasecost + enginecost + (costperwheel * target.numberOfWheels) + (costperdoor * target.numberOfDoors);
		System.out.println("The " + target.vehicleName + " " + target.numberOfDoors + " Door " +"with the issue of " + target.vehicleDesc + " has a total repair cost of £" + totalcost);
		} else if (obj instanceof Motorbike) {
			Motorbike target = (Motorbike) obj;
			int totalcost = motorcyclebasecost + enginecost + (costperwheel * target.numberOfWheels);
			if(target.isSpeedBike) {
				totalcost = costsuperbike + totalcost;
			}
			System.out.println("The " + target.vehicleName + " with the issue of " + target.vehicleDesc + " has a total repair cost of £" + totalcost);
		}else if (obj instanceof Bicycle) {
			Bicycle target = (Bicycle) obj;
			int totalcost = bicyclebasecost + (costperwheel * target.numberOfWheels);
			System.out.println("The " + target.vehicleName + " with the issue of " + target.vehicleDesc + " has a total repair cost of £" + totalcost);
			
		}
	}
	
	
	}
	
	
	public void clearGarage() {
		GarageList.clear();
	}
}
