package com.spring.config;

import org.springframework.context.annotation.Bean;

import com.spring.core.CustomerBo;

public class CustomerConfig {

	@Bean(name="customerBean")
	public CustomerBo getCustomer(){
		return new CustomerBo();
	}
}
