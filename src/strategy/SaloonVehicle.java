package strategy;

public class SaloonVehicle extends Vehicle {
 
	public SaloonVehicle() {
 
		forSale = new Sale();
                driveability = new VehicleDriving();
 

	}
 
	public void bodyType() {
		System.out.println("Vehicle Body Type is a Saloon Car");
	}
}
