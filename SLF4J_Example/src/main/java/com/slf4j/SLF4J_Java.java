package com.slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SLF4J_Java {

	
	   public static void main(String[] args) {
	      //Creating the Logger object
	      Logger logger = LoggerFactory.getLogger("SampleTry");
	      Integer age = 22;
	      //Logging the information
	      logger.info("Thank God.. It Finally Worked!!!!");
	      logger.info("At the age of {} I got my first job", age);   
          logger.warn("Hello World");	       
          logger.error("Hello World");

	   
	}
}
