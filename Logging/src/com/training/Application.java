package com.training;
import java.util.logging.*;
public class Application {

	public static void main(String[] args) {
		
		
			
			Logger log=Logger.getLogger("com.example.Application");
			
			log.setLevel(Level.WARNING);
			log.info("Info Message");
			
			//System.out.println("Info Message");
			
			log.warning("Warning Message***********");
			log.severe("Severe Message %%%%%%%%%%%%%");
			log.fine("I am fine Message #########");
			
	}

}
