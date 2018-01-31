package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client
{

public static void main(String []args)
{

Resource r= new ClassPathResource("resources/spring.xml");
BeanFactory factory=new XmlBeanFactory(r);
Object o =factory.getBean("t");
Object o1 =factory.getBean("t");
Object o2 =factory.getBean("t");

System.out.println(o==o1);//if singleton  it will return true
System.out.println(o1==o2);//if  prototype it will return false
Test t=(Test)o;
t.hello();
}
}
