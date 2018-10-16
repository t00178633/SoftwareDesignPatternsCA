package strategy;

public class VehicleSearch1 {
 
	public static void main(String[] args) {
 
		SaloonVehicle saloon = new SaloonVehicle();
		ToyVehicle toyCar = new ToyVehicle();
		WriteOff writeOff = new WriteOff();
 
		ModelVehicle model = new ModelVehicle();

		saloon.isForSale();
		toyCar.isForSale();
		writeOff.isForSale();
   
		model.isDriveable();
		model.setDriveability(new VintageVehicle());
		model.isDriveable();
	}
}
