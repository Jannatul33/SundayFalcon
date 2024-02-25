package com.upskill.assignment_1;

public class Assignment_1_4 {

	
	public static int functionReturn30(){
		return 30;
	}
	
	public static int functionReturn50(){
		return 50;
	}
	public static void main(String[] args) {
		
		int substractionValue = functionReturn50()-functionReturn30();
		System.out.println("Substraction value from bigger function to smaller =" + substractionValue);
		


	}

}
