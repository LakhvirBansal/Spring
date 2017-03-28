package com.springDI.helper;

import com.springDI.business.GenerateOutput;

public class OutputHelper {
	GenerateOutput generateOutput;

	OutputHelper(GenerateOutput generateOutput){
		this.generateOutput = generateOutput;
	}
	
	public void generateDataOutput(){
		generateOutput.generateMessage();
	}
}
