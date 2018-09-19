package strategy;

public class Hatchback extends Vehicle {
 
	public Hatchback() {
		driveability = new VehicleDriving();
		forSale = new Sale();
	}
 
	public void bodyType() {
		System.out.println("Vehicle Type: Hatchback Vehicle");
	}
}
