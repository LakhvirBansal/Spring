package com.spring.scheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.business.PrintMsg;
import com.spring.businessimpl.MessageData;
import com.spring.configuration.MessageConfig;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		PrintMsg msg = (PrintMsg) context.getBean("msgBean");
		msg.printWishMsg("have a nice day.");
		MessageData msgdata = (MessageData) context.getBean("msg1Bean");
		msgdata.printDataMsd();
	}
}
