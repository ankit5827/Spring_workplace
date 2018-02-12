package test;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;

public class Client {
public static void main(String[] args) {
	ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");
//	ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring_byName.xml");
//	ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring_byConstructor.xml");
//	ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring_byautodetect.xml");
	Car c=(Car)ap.getBean("c");
	c.printData();
	
	/*Bus b=(Bus)ap.getBean("b");
	b.printData();*/
}
}
