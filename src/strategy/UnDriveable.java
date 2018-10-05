package strategy;

public class UnDriveable implements Driveability {
	public void driveable() {
		System.out.println("Car Cannot Drive Due to Engine Fault");
	}
}
