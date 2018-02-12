package beans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable cc;
	
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}


	public void setCricketers(TreeSet cricketers) {
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
		System.out.println("Cricketers......");
		
			System.out.println(cricketers);
		
	
		System.out.println("country and capital.....");
		Set keys=cc.keySet();
		for (Object key: keys)
		{
			System.out.println("Country="+key+ "Capital: "+cc.get(key));
		}
	}
}
