/**
 * File: Simple.java
 * 
 * Print a simple message about Java.
 */ 

/*
	1.	simple (Why do you even have to change the name of the file in this case?)
		Valid - we need to change the file name because the class name should match the file name including case
	
	2.	SimpleProgram
		Valid

	3.	1Simple
		Not Valid - identifiers can not start witha number
	
	4.	_Simple_
		Valid
	
	5.	*Simple*
		Not Valid - Asterix (*) is not a valid character in identifier
	
	6.	$123_45
		
		Valid???

	7.	Simple!
		Not Valid - Exclamation mark (!) is not a valid character in identifier


	A trick for testing
		- In Java the class name and file name must match only if the class is public, so if you remove the public 
		  access modifier from the class modifier you will be able to change the class name without changing the file name
		  so long as the class name is a valid identifier
		
		- A Java a single file may contain the definition of multiple classes, however, only one of them can be public. If a public
		  class exists within the file the file name should match this public class's name

*/
$123_45 class $123_45 {
	public static void main (String[] args) {
		int a=1;
		System.out.println (a++);
		System.out.println (++a);
	}
}