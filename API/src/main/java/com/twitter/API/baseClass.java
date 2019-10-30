package com.twitter.API;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class baseClass {
	
	public static Logger log=null; 
	public baseClass() {
	PropertyConfigurator.configure("C:\\Users\\Online Test\\OneDrive_1_10-29-2019\\API\\resource\\log4j.properties");
	}

}
