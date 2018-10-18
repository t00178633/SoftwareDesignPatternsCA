package strategy;

public class VehicleSearch2 {
 
	public static void main(String[] args) {
 
		Vehicle saloon = new SaloonVehicle();
		saloon.isForSale();
		saloon.isDriveable();
   
		Vehicle model = new ModelVehicle();
		model.isDriveable();

		model.setDriveability(new VintageVehicle());
		model.isDriveable();

	}
}
