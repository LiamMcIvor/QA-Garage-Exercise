package garage;

public abstract class Vehicle {
	
	public int noOfDoors;
	public int noOfWheels;
	public int engineSize;
	
	public int cost;
	public int doorPrice = 5;
	public int wheelPrice = 10;
	public int enginePrice = 50;




	
//	public Vehicle(int noDoors, int noWheels, int eSize, int vCost) {
//		this.noOfDoors(noDoors);
//		this.noOfWheels = noWheels;
//		this.engineSize = eSize;
//		this.cost = vCost;
//	}

	public abstract void accelerate();
	
	public abstract void brake();
	
	public int getVehicleCost() {
		cost = (engineSize*enginePrice) + (doorPrice*noOfDoors) + (wheelPrice*noOfWheels);
		return cost;
	}
	
	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

}
