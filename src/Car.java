//pulls details from general class
public class Car extends Vehicle{
	int numberOfDoors;
// sets as object
		public Car() {
			super();
		
			//sets format
		}
		public Car(String name, String description, boolean engine, int wheels, int numberOfDoors) {
			super(name, description, engine, wheels);
			this.numberOfDoors = numberOfDoors;
		}
		//overrides cost
		@Override
		public boolean hasEngine() {
			boolean hasEngine = true;
			return hasEngine;
		}
		public int numberOfWheels() {
			int numberOfWheels = 4;
			return numberOfWheels;
		}
		
}
