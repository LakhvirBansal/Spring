package com.spring.config;

import org.springframework.context.annotation.Bean;
import com.spring.core.VendorBo;

public class VendorConfig {
	
	@Bean(name="vendorBean")
	public VendorBo getVendor(){
		return new VendorBo();
	}
	
}
