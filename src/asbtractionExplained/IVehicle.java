package asbtractionExplained;

public interface IVehicle {

	static int vehicleCount = 0;

	public  void run();

	public abstract void hasEngine();

	public  void test() ;
	public void IVehicle(int doors, int speed, String color);
	
}
