package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scheduler {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-module.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		/*Resource res = new ClassPathResource("Spring-module.xml");
		BeanFactory factory = new XmlBeanFactory(res);
 
		Object o = factory.getBean("helloBean");
		HelloWorld wb = (HelloWorld)o;
 
		wb.printHello();*/
	}
}
