package garage;

public class Car extends Vehicle {
	
	private int bootSize;
	private int bootPrice = 10;
	
	public Car(int noDoors, int noWheels, int eSize, int bSize) {
		this.setNoOfDoors(noDoors);
		this.setNoOfWheels(noWheels);
		this.setEngineSize(eSize);
		this.bootSize = bSize;
	}
	
	@Override
	public void accelerate() {
		System.out.println("Car accelerates fast");
	}
	
	@Override
	public void brake() {
		System.out.println("Car brakes fast");
	}
	
	public int getBootSize() {
		return this.bootSize = bootSize;
	}

	@Override
	public int getVehicleCost() {
		cost = (engineSize*enginePrice) + (doorPrice*noOfDoors) + (wheelPrice*noOfWheels) + (bootPrice*bootSize);
		return cost;
	}
}
