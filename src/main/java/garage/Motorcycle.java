package garage;

public class Motorcycle extends Vehicle {

	

	private boolean hasPillion = false;
	private int pillionPrice = 100;
	
	public Motorcycle(int noDoors, int noWheels, int eSize, boolean pillion) {
		this.setNoOfDoors(noDoors);
		this.setNoOfWheels(noWheels);
		this.setEngineSize(eSize);
		this.hasPillion = pillion;
	}

	@Override
	public void accelerate() {
		System.out.println("Motorcycle accelerates faster");
		
	}

	@Override
	public void brake() {
		System.out.println("Motorcycle brakes faster");
		
	}
	
	public boolean hasPillion() {
		return hasPillion;
	}

	@Override
	public int getVehicleCost() {
		cost = (engineSize*enginePrice) + (wheelPrice*noOfWheels);
		if(hasPillion) {
			cost += pillionPrice;
		}
		return cost;
	}

//	public void setPillion(boolean hasPillion) {
//		this.hasPillion = hasPillion;
//	}
}
