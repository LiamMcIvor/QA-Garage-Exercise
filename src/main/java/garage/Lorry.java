package garage;

public class Lorry extends Vehicle{
	
	private boolean hasTrailer = false;
	private int trailerPrice = 500;
//	private int cost;
	
	public Lorry(int noDoors, int noWheels, int eSize, boolean trailer) {
		this.setNoOfDoors(noDoors);
		this.setNoOfWheels(noWheels);
		this.setEngineSize(eSize);
		this.hasTrailer = trailer;
	}
	
	@Override
	public void accelerate() {
		System.out.println("Lorry accelerates slowly");
		
	}

	@Override
	public void brake() {
		System.out.println("Lorry brakes slowly");
		
	}
	
	public boolean hasTrailer() {
		return this.hasTrailer;
	}

	@Override
	public int getVehicleCost() {
		cost = (engineSize*enginePrice) + (doorPrice*noOfDoors) + (wheelPrice*noOfWheels);
		if(hasTrailer) {
			cost += trailerPrice;
		}
		return cost;
	}
}
