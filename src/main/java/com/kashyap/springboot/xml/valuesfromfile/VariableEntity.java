package com.kashyap.springboot.xml.valuesfromfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class VariableEntity {

	@Value("${host.website.name}")
	private String value;
	
	public String getValue(){
		return value;
	}
}
