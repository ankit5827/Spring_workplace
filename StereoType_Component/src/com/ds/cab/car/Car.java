package com.ds.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.cab.engine.Engine;
@Component
public class Car {
	@Autowired
private Engine engine;
public void printData()
{
	System.out.println("Eng name.."+engine.getEngname());
}



}
