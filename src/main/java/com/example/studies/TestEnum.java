package com.example.studies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Version;

import com.examples.studies.enums.PlatformTypesEnum;
import com.examples.studies.request.Request;

public class TestEnum {
	
	public static final Logger LOG = LoggerFactory.getLogger(TestEnum.class);
	
	public static void main(String[] args) {
		
		Version vAndroid = Version.parse("1.2.3");
		
		PlatformTypesEnum.valueOf("ANDROID").checkVersion(new Request(), "1.3.1", vAndroid)
			.subscribe(
				  value -> System.out.println(value), 
				  error -> error.printStackTrace());		
		
		Version vIos = Version.parse("3.2.1");
		
		PlatformTypesEnum.valueOf("IOS").checkVersion(new Request(), "1.3.1", vIos)
			.subscribe(
			  value -> System.out.println(value), 
			  error -> error.printStackTrace());
	}
}