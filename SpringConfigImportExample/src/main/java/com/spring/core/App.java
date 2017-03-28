package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerBo customerBO = (CustomerBo) context.getBean("customerBean");
		customerBO.printMsg("customer");

		VendorBo vendorBo = (VendorBo) context.getBean("vendorBean");
		vendorBo.printMsg("vendor");
	}

}
