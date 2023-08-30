/** 
 * Dates.java 
 * 
 * Determine whether a 2nd-millenium date entered by the user is valid
 */ 

import java.util.Scanner;

public class Dates {

	public static void main(String[] args) {
		int month, day, year; //date read in from user
		int daysInMonth; //number of days in month read in
		boolean monthValid = false, yearValid = false, dayValid = false; //true if input from user is valid
		boolean leapYear = false; //true if user's year is a leap year
	
		Scanner scan = new Scanner(System.in);
		
		//Get integer month, day, and year from user
		System.out.print("Enter date [Day Month Year]: ");
		
		day = scan.nextInt();
		month = scan.nextInt();
		year = scan.nextInt();
		
		//Check to see if month is valid
		if(month >= 1 && month <= 12){
			monthValid = true;
		}

		//Check to see if year is valid
		if(year >= 1000 && year <= 1999){
			yearValid = true;
		}

		//Determine whether it's a leap year
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			leapYear = true;
		}

		//Determine number of days in month
		if(month == 4 || month == 6 || month == 9 || month == 11){
			daysInMonth = 30;
		}else if(month == 2){
			if(leapYear){
				daysInMonth = 29;
			}else {
				daysInMonth = 28;
			}
		}else {
			daysInMonth = 31;
		}

		//User number of days in month to check to see if day is valid
		if(day >= 1 && day <= daysInMonth){
			dayValid = true;
		}

		//Determine whether date is valid and print appropriate message
		if(dayValid && monthValid && yearValid){
			System.out.println("Date is valid"+ (leapYear?" and it's a leap year":""));
		}else {
			System.out.println("Date is not valid");
		}

	}
}