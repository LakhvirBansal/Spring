package com.spring.businessimpl;

import com.spring.business.PrintMsg;

public class PrintMsgImpl implements PrintMsg {

	@Override
	public void printWishMsg(String message) {
		System.out.println("the message is "+message);

	}

}
