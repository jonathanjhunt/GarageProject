
public class Bicycle extends Vehicle{
	boolean isRoadBike;
// sets as object
		public Bicycle() {
			super();
		
			//sets format
		}
		public Bicycle(String name, String description, boolean engine, int wheels, boolean isRoadBike) {
			super(name, description, engine, wheels);
			this.isRoadBike = isRoadBike;
		}
		//overrides cost
		@Override
		public boolean hasEngine() {
			boolean hasEngine = false;
			return hasEngine;
		}
		public int numberOfWheels() {
			int numberOfWheels = 2;
			return numberOfWheels;
		}
}