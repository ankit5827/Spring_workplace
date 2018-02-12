package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	
	@Autowired
	@Qualifier(value="e1")
	
	private Engine engine;

	
	//no need to have setters or constructors
	public void printData()
	{
		System.out.println("Engine model year.."+engine.getModelyear());
	}

}
