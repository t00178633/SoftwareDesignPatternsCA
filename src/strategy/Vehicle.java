package strategy;

public abstract class Vehicle {
	Driveability driveability;
	ForSale forSale;
 
	public Vehicle() {
	}
 
	public void setDriveability(Driveability drive) {
		driveability = drive;
	}
 
	public void setForSale(ForSale sale) {
		forSale = sale;
	}
 
	abstract void bodyType();
 
	public void isDriveable() {
		driveability.driveable();
	}
 
	public void isForSale() {
		forSale.forSale();
	}
 
	public void mileage() {
		System.out.println("All cars have mileage!");
	}



}
