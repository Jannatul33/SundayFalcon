package com.upskill.java_3;

    import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Hashtable;
	
	public class Array_Hashmap_Hashset_HashTab {

   public static void main(String[] args) {
			
			// Array store multiple data using index
			
			int age = 30;                                       // variab
			int[] ageFalcon = new int[]{25,30,28,35,40};        // Array
			
			//Array index             [0] [1] [2] [3] [4]
			
			System.out.println("Student Age :" + ageFalcon[2]);
			System.out.println("Total Student :" + ageFalcon.length);
			
			//Write an Array for student name
			
			String[] nameFalcon = new String[]{"Sharmin","Sumaiya","Farhana","Lubna","Tahmid",};
			System.out.println("Student Name:" + nameFalcon [3]);
			System.out.println("Total Student :"+ nameFalcon.length);
			

			boolean[] attendencetFalcon = new boolean[]{true, false, false, true};
			
			System.out.println("Student Attendance :" + attendencetFalcon [3]);
			System.out.println("Total Student :" + attendencetFalcon.length);
			
			// Multi-Dimentional Array
			
			int[][] ageFalcon2D = {{25,30,28,35,40},  //[0][0] [0][1] [0][2] [0][3] [0][4]
			                       {24,28,32,22}};    // [1][0] [1] [1] [1] [2] [1][3]
			System.out.println("Student Age 2D:"+ ageFalcon2D[0][3]);
			
			// Hashmap store multipul data using key-value pair, Implementation of Map interface
			
			HashMap<String, Integer> StudentAge = new HashMap<String,Integer>();
			
			StudentAge.put("Tahmid",25);
			StudentAge.put("Lubna", 24);
			StudentAge.put("Salman",27);
			StudentAge.put("Rumi", 35);
			StudentAge.put("Sumaiya",25);
			
			System.out.println("Hashmap Student Age :" + StudentAge.get("Lubna"));
			
			HashMap<String, String> CountryCity = new HashMap<String,String>();
			CountryCity.put("USA", "Dunwoody");
			CountryCity.put("Bangladesh","Sylhet");
			
			System.out.println("Hashmap Countrty City :" + CountryCity.get("USA"));
			
			//HashTable store multiple data using key-value pair, no duplicate,
			// also is synchronized (only one thread can be modified)
			
			Hashtable<String, String> Region = new Hashtable<String,String>();
			Region.put("USA", "Dunwoody");
			Region.put("Bangladesh","Sylhet");
			
			System.out.println("Hashtable Region :" + Region.get("USA"));
			
			//HashSet store unordered collection containing unique, value, implementation of set interface
			
			HashSet<String> car = new HashSet<>();
			car.add("BMW");
			car.add("TESLA");
			car.add("AUDI");
			car.add("FORD");
			System.out.println("car :"+ car);
		

			
			
					
	}

}
