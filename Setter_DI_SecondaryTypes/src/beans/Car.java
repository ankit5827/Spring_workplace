package beans;

public class Car {
	private String carname;
	private Engine engine;
	
	public Car() {
		System.out.println("CAr");
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarData()
	{
		System.out.println("Car Name..."+carname);
		System.out.println("Model year...."+engine.getModelyear());
	}
	

}
