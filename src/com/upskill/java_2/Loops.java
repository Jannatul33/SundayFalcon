package com.upskill.java_2;

public class Loops {

    /*
     Types of Loops
     1. For Loop
     2. While Loop
     3. Do While Loop
     4. Infinite Loop
  */
	
	// For Loop
    public static void main(String[] args) {
    	 practiceForLoop();
    	 practiceWhileLoop();
    	 practiceDoWhileLoop();
    	 practiceInfiniteLoop();
    	 practiceNastedLoop();
         
    
}

	public static void practiceForLoop() {      //for loop-Do again and again upto upper limit
		int i;                                  //Initialize the variable
		for (i = 1; i <= 10; i++){         // setting lower limit. upper limit. increment or decrement
		System.out.println("For Loops number =" +i);                  // statement 
		
	  }
		
	}

    // While Loop
    public static void practiceWhileLoop(){                     //while Loop- do again and again upto condition match
         int i = 1;                                             // initialize the variable
         while (i<10){                                          // setting condition
        	 System.out.println("While Loops number = " + i);   // statement   
        	 i++;                                               // Increment or decrement
         }
	}
	
	 // Do While Loop
		public static void practiceDoWhileLoop(){                     //Do while Loop- do action  and then match condition match
	         int i = 1;                                             // initialize the variable
	         do {                                                   // statement
	        	 System.out.println("Do Loops number = " + i);     // increment or decrerement 
	        	 i++;                                              // checking condition
	         } while (i<=0);
		}  

     // Infinite Loop
     public static void practiceInfiniteLoop(){                     //Infinite Loop- never ending loop
        int i;                                                      // initialize the variable
        for (i = 1; ; i++){                                         // setting no upper limit 
   	       System.out.println("For Loops number = " + i);       // statement   
   	                                                   
       }
   }
     // Nested loop
     public static void practiceNastedLoop(){           // Nested Loop- Loop inside another loop
    	 int i;                                         // Loop 1 - Initialize i
    	 int j;                                         // loop 2 - initialize j
    	 for(i =1; i <= 10; i++){                       // loop 1- setting lower limit upper limit 
    		 for(j = 1; j <= 10; j++){                  // loop 2- setting lower limit upper limit 
    			 int multipicationTable = i * j;
    			 System.out.print(multipicationTable +" "); // loop 2- statement
    		 }
    		 System.out.println(" ");                        // loop 1- statement 
    	 }
     }
}	
		
	


