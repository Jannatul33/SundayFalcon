package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object 
	
	// private constructor, it prevent any other class from instantiating 
	
		public Singleton(){
	}
		
		// private static object of the class
	   public static Singleton singletonobj = new Singleton();
	   
	   public static Singleton getInstant(){
		   return singletonobj;
	   }
	   protected static void demo(){
		   System.out.println("Demo method for singleton class");
	   }
	}


