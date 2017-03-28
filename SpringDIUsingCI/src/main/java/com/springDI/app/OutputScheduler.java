package com.springDI.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springDI.helper.OutputHelper;

public class OutputScheduler {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		OutputHelper output = (OutputHelper) context.getBean("outputData");
		output.generateDataOutput();
	}
}
