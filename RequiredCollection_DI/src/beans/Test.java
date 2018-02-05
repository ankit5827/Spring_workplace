package beans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class Test {

	private Vector fruits;
	private TreeMap cricketers;
	private Hashtable cc;
	
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}


	public void setCricketers(TreeMap cricketers) {
		this.cricketers = cricketers;
	}


	public void setCc(Hashtable cc) {
		this.cc = cc;
	}


	public void printData()
	{
		System.out.println("fruits.........");
		for (Object fruit: fruits )
		{
			System.out.println(fruit);
		}
		/*System.out.println("Cricketers......");
		for(Object cricketer : cricketers)
		{
			System.out.println(cricketer);
		}*/
		/*System.out.println("country and capital.....");
		 keys=cc.keySet();
		for (Object key: keys)
		{
			System.out.println("Country="+key+ "Capital: "+cc.get(key));
		}*/
	}
}
