package garage;

import java.util.*;

public class Garage {

	List<Vehicle> garageList = new ArrayList<>();
	private int cost;
	private int doorPrice = 5;
	private int wheelPrice = 10;
	private int enginePrice = 50;
	private int bootPrice = 10;
	private int trailerPrice = 500;
	private int pillionPrice = 100;
	
	public int getVehicleCost() {
		for(Vehicle g : garageList) {
//			cost = (g.getEngineSize()*enginePrice) + (doorPrice*g.getNoOfDoors()) + (wheelPrice*g.getNoOfWheels());
			return g.getVehicleCost();
//			return cost;
		}
		return cost;
	}
	
	public void removeVehicle(String name) {
		garageList.remove(name);
	}
}
