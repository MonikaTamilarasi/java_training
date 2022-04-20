package com.training.model;
import java.io.IOException;
import java.util.logging.*;

import javax.management.RuntimeErrorException;
public class LogToFile {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");

			log.addHandler(handler);
			log.info("Try Block Called");
			throw new RuntimeException("K is a good performer");
			
		} catch (SecurityException e) {
			log.warning(e.getMessage());
			
		} catch (IOException e) {
			log.warning(e.getMessage());
		}
	}

}
