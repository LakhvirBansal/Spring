package com.springDI.businessImpl;

import com.springDI.business.GenerateOutput;

public class JsonOutputGenerator implements GenerateOutput {

	@Override
	public void generateMessage() {
		
		System.out.println(" Json type output ");

	}

}
