package com.upskill.java_1;

public class Variables {
// variables in Java
	// Instant or global variable- variables declared in class level, outside method.
	// Static variable- variable belong to class and dont required creating object.
	// Local variable- variable declared in method.
	// Method parameter- variables used as method parameter 
	
	String country = "usa";
	
	static String region  = "America";

	public static void main(String[] args) {
		String city = "New York";
		System.out.println(city);
		String police = "NYPD";
		int zipcode = 10075;
		
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
		object.CT("DanbStaary");
	}
	
	public void NJ(){
		String city = "Paterson";
		System.out.println("city");
		
		Variables object = new Variables();
		System.out.println(object.country);
		System.out.println(region);
	}
	
	public void CT (String county){
		String myCounty = county;
		System.out.println(myCounty);
		String city = "Hartfort";
		System.out.println(city);
		
		Variables object = new Variables();
		System.out.println(object.country);
		System.out.println(region);
		
		
		
		
		
	}

}
