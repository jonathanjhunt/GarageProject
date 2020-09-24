import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		// garagecompiler
		Vehicle Motorbike1 = new Motorbike("Triumph Tiger 900", "Broken Front Suspension", true, 2, false);
		Vehicle Motorbike2 = new Motorbike("Ducati Green Monster", "Smashed to Pieces", true, 2, true);
		Vehicle Car1 = new Car("Seat Leon", "New Engine Needed", true, 4, 3);
		Vehicle Bicycle1 = new Bicycle("Pinerello F10", "Electric Gears Broken", false, 2, true);

		Garage garage = new Garage();
		garage.addVehicle(Motorbike1);
		garage.addVehicle(Motorbike2);
		garage.addVehicle(Car1);
		garage.addVehicle(Bicycle1);

		garage.calculateBill();
		//garage.clearGarage();

	}

}
