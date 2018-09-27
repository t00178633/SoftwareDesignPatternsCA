package strategy;

public class ToyVehicle extends Vehicle {
 
	public ToyVehicle() {
		driveability = new UnDriveable();
		forSale = new SpareParts();
	}
 
	public void bodyType() {
		System.out.println("Toy car suitable for children");
	}
}
