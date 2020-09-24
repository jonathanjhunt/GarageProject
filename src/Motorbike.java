//pulls details from general class
public class Motorbike extends Vehicle{
	boolean isSpeedBike;
// sets as object
		public Motorbike() {
			super();
		
			//sets format
		}
		public Motorbike(String name, String description, boolean engine, int wheels, boolean isSpeedBike) {
			super(name, description, engine, wheels);
			this.isSpeedBike = isSpeedBike;
		}
		//overrides cost
		@Override
		public boolean hasEngine() {
			boolean hasEngine = true;
			return hasEngine;
		}
		public int numberOfWheels() {
			int numberOfWheels = 2;
			return numberOfWheels;
		}
}