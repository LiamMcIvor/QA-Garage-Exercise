package garage;

public class App {

	public static void main(String[] args) {
		Car car = new Car(4, 4, 1000, 100);
		Motorcycle bike = new Motorcycle(0, 2, 650, true);
		Lorry lorry = new Lorry(2, 6, 10000, true);
//		System.out.println(car.getEngineSize());
		Garage garage = new Garage();
		garage.garageList.add(car);
		garage.garageList.add(bike);
		garage.garageList.add(lorry);
//		System.out.println(garage.garageList.get(0).getEngineSize());
		System.out.println(garage.getVehicleCost());
		for(Vehicle v : garage.garageList) {
			System.out.println(garage.garageList.indexOf(v));
			System.out.println(garage.getVehicleCost());
		}
		garage.removeVehicle("Car");
	}
}
