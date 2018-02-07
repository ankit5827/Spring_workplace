package beans;

public class Bus {
private Engine engine;
public Bus()
{
	System.out.println("Bus default constructor");
}
public void setEngine(Engine engine) {
	System.out.println("setter engine");
	this.engine = engine;
}
public Bus(Engine engine)
{
	System.out.println("Bus constructor ");
	this.engine=engine;
}
public void printData()
{
	System.out.println("bus model year....."+engine.getModelyear());
}
}
