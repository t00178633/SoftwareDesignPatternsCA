package strategy;

public class WriteOff extends Vehicle {
	public WriteOff() {
		setDriveability(new UnDriveable());
		setForSale(new PartsOnly());
	}
	public void bodyType() {
		System.out.println("Saloon - Write Off - Cat D");
	}
}
