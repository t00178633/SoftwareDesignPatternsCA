package strategy;

public class ModelVehicle extends Vehicle {
	public ModelVehicle() {
		driveability = new UnDriveable();
		forSale = new Sale();
	}

	public void bodyType() {
		System.out.println("Estate");
	}
}

