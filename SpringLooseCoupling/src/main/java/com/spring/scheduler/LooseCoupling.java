package com.spring.scheduler;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.helper.OutputHelper;

public class LooseCoupling {
	public static void main(String[] args) {
		
	/*	ApplicationContext context = 
		    	   new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});

		    	OutputHelper output = (OutputHelper)context.getBean("outputdata");
		    	output.generateOutput(); */
		Resource res = new ClassPathResource("Spring-Common.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		OutputHelper output = (OutputHelper)factory.getBean("outputdata");
		output.generateOutput();
		
	}

}
