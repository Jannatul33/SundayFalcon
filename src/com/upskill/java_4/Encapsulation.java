package com.upskill.java_4;

public class Encapsulation {
	
	public static void main (String[] args){
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Tahmid");
		System.out.println(obj.getName());
		obj.setssn(999999);
		System.out.println(obj.getuserName());
		obj.setpassword("upskill999");
	}

	// Encapsulation used to hide the data using and getter method
	// same object different time 
	
	private String name = "rasel";                // Read and write 
	private int mobileNumber = 4354654;          // Retrieve, Read only
	private int ssn = 344556;                    // Update, write only 
	private String username = "Upskill";         // Retrieve, read only 
	private String password = "Upskill123";      //Update, write only
	
	//Setter Method - name                        // set the date, write
	
	public void setName (String value){
		name = value;
	}
	//Getter Method - name                       // Get the data, Read
	public String getName(){
		return name;
	}
	
	// Getter Method - mobileNumber               // Get the data, Read
	public int getmobileNumber(){
		return mobileNumber;
	}
	
	// Setter Method - ssn                      // Set the data, write
	public void setssn(int value){
		ssn = value;
	}
	// Getter Method - userName
	public String getuserName(){
		return username;
	}
	//Setter Method - Password 
	public void setpassword (String value){
		password = value;
}

	}


