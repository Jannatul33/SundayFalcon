package com.upskill.java_6;

public class Exceptions_TryCatchFinally {
	
	/* Java Exceptions - Use "Try - Catch - Finally"
	 
	
       A. Built- in Exceptions- built-In Exception throws by java which explain certain error situations
           1. ArithmeticException- error has occurred in an arithmetic operation.
           2. ArrayIndexOutOfBoundsException- An array has been accessed with an illegal index
           3. ClassNotFoundException- Try to access a class whose definition is not found.
           4. FileNotFoundException- A File is not accessible or does not open.
           5. IOException- Input-output operation failed or interrupted 
           6. InterruptedExpection- Thread is waiting, sleeping or doing some processing and it is interrupted.
           7. NoSuchFileException- class does not contains the failed or variable specified 
           8. NoSuchMethodException - Accessing a method which is not found.
           9. NullPointerException- referring to the member of a null object
          10. NumberFormatException - a method could not convert a string into a numeric format.
          11. RunTimeException - any exception which occurs during runtime.
          12. StringIndexOutOfBoundsException- string class method to  indicate that an index is either negative or greater then
         
      B. User-Defined Exceptions - User can also create exception where situation is not covered by java.
           
           
	 */

	public static void main(String[] arge){
		
		//Built-in Exceptions- ArrayIndexOutOfBoundsException
		try{
		
		int[]ageFalcon = new int[]{25,28,29,30,35};
		System.out.println ("Student Age = " + ageFalcon[12]);
	} catch (Exception e){
		e.printStackTrace();
		System.out.println("Array Fix");
	}
	
		// Specific Built-in Exception- NumberFormatException
		
		try {
			int num = Integer.parseInt("Test");
			System.out.println(num);
		}catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Parshing Fix");
	      }
		
		// User-Defined Exception
		 
		try{
			throw new myException("Test");
		} catch (myException e){
			e.printStackTrace();
			System.out.println("This is User- Definded Exception Method !");
		}
		
		finally {
			System.out.println("Test Completed");
		
		}
		
		}
}

