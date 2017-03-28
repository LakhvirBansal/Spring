package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.business.PrintMsg;
import com.spring.businessimpl.MessageData;
import com.spring.businessimpl.PrintMsgImpl;

@Configuration
public class MessageConfig {

	@Bean(name="msgBean")
	public PrintMsg getMessage(){
		return new PrintMsgImpl();
	}
	
	@Bean(name="msg1Bean")
	public MessageData getMessageData(){
		return new MessageData();
	} 
}
