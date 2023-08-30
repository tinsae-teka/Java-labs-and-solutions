/** 
 * File: ListTest.java 
 * 
 * A simple test program that creates an IntList, puts some 
 * ints in it, and prints the list. 
 */ 

public class ListTest {
	
	public static void main(String[] args) {
		
		IntList myList = new IntList(10);
		
		myList.add(100);
		myList.add(50);
		myList.add(200);
		myList.add(25);
		
		System.out.println(myList);


		SortedIntList mySortedList = new SortedIntList(10);
		
		mySortedList.add(100);
		mySortedList.add(50);
		mySortedList.add(200);
		mySortedList.add(25);
		
		System.out.println(mySortedList);
	}
}