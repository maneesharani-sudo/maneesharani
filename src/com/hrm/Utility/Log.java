package com.hrm.Utility;
import org.apache.log4j.Logger;

public class Log {
	//initilize log4j log
private static Logger Log= Logger.getLogger(Log.class.getName());
public static void info(String message){  
Log.info(message);     
}
}