package com.upskill.java_4;

public class Constructor {
	
	/* Constructor is instance of class, method same as class name, java will execute constructor first
	  - Constructor cannot be static or override no void or return type.
	  - Default Constructor: No constructor is initialized
	  - Parameterized Constructor: Add different signature
	  -Constructor overloading : Different signature  
	 */
	
	String studentName;
	int studentAge;
	
    public Constructor(String Name, int Age){
    	studentName= Name;
    	studentAge= Age;
    }
    
    public Constructor(String Name){
    studentName= Name;
    }
    
    
    public Constructor(int Age){
    studentAge= Age;
    	
    }
   
    
	public static void main(String[] args) {
		
		Constructor obj1 = new Constructor ("Fariyan", 25);
		System.out.println(obj1.studentName);
		System.out.println(obj1.studentAge);
		
		Constructor obj2 = new Constructor ("Nahian");
		System.out.println(obj2.studentName);
		
		Constructor obj3 = new Constructor(25);
		
		System.out.println(obj3.studentAge);


	}

}
