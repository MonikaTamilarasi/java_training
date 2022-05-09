package com.training;

import java.io.*;

	public class Application{

	  public static void main(String[] args) {

	    File File = new File("Fruit.txt");
	    File File1 = new File("File.txt");
	  
	try {
	      
	      FileWriter myWriter = new FileWriter("Fruit.txt");
	      myWriter.write("Apple is red in colour Orange is round in shape "
	      		+ "Banana is good for health Grapes will grow as bunch "
	      		+ "Mango is a seasonal fruit");
	      myWriter.close();
	      
	      FileWriter myWriter1 = new FileWriter("File.txt");
	      myWriter1.write("Description");
	      myWriter1.close();
	      
	      System.out.println("Files has been created");
	      
	      
	      
	      PrintWriter print = new PrintWriter("File.txt");
	          
	        
	        BufferedReader buffer = new BufferedReader(new FileReader("Fruit.txt"));
	          
	        String line = buffer.readLine();
	          
	        while (line != null)
	        {
	            print.println(line);
	            line = buffer.readLine();
	        }
	        print.flush();
	          

	        buffer.close();
	        print.close();
	        
	           if (File.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("Failure");
	        }
	      
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }

	  }
	}