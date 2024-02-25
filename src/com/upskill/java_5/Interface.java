package com.upskill.java_5;

public interface Interface {
	
	//Interface can have only abstract method, java 8 and forward they have static method too.
	// Abstract method doesn't have any implementation.

	public abstract void iDoor();         // void method
	
	public abstract int iWheel();       //return type method int

	public abstract String iEngine();     // return type method string 

}
/* 
 (parent)                     (keyword)            (Child)                9Keyword)              (GrandChild)	
 
Class                         extends              class
Abstract class (+3)           extends              class(3-3=0)
interface(+3)                 Implements           class(3-3=0)
interface(+3)                 extends             interface(+3+3=6)      implements             class(6-6=0)

*/
	
