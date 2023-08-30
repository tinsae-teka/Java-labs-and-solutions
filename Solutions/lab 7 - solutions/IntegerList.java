/** 
 * File: IntegerList.java 
 * 
 * Define an IntegerList class with methods to create, fill, 
 * sort, and search in a list of integers.
 */ 
import java.util.Scanner;

public class IntegerList {
	int[] list; //values in the list
	
	/** 
	 * create a list of the given size
	 */ 
	public IntegerList(int size) {
		list = new int[size];
	}

	/** 
	 * fill array with integers between 1 and 100, inclusive
	 */ 
	public void randomize() {
		
		for (int i=0; i<list.length; i++)
			list[i] = (int)(Math.random() * 100) + 1;
	}

	/** 
	 * print array elements with indices
	 */ 
	public void print() {
		
		for (int i=0; i<list.length; i++)
			System.out.println(i + ":\t" + list[i]);
	}

	/**
	 * @return the index of the first occurrence of target in the list. 
	 * return -1 if target does not appear in the list
	 */ 
	public int binarySearchD (int target) {
		int start = 0;
		int end = list.length-1;
		int location = -1;
		while(start <= end){
			int mid = (start + end)/2;
			if(list[mid] == target){
				location = mid;
				break;
			}else if(list[mid] > target){
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}

		return location;
	}

	public int search(int target) {
		int location = -1;
		
		for (int i=0; i<list.length && location == -1; i++)
			if (list[i] == target)
		
		location = i;
		return location;
	}
	
	/** 
	 * sort the list into ascending order using the selection sort algorithm
	 */ 
	public void selectionSort() {
		
		int minIndex;
		
		for (int i=0; i < list.length-1; i++) {
			//find smallest element in list starting at location i
			minIndex = i;
			
			for (int j = i+1; j < list.length; j++)
				if (list[j] < list[minIndex])
					minIndex = j;
					//swap list[i] with smallest element
		
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}
	/** 
	 * sort the list into decreasing order using the selection sort algorithm
	 */ 
	public void sortDecreasing() {
		
		int maxIndex;
		
		for (int i=0; i < list.length-1; i++) {
			//find largest element in list starting at location i
			maxIndex = i;
			
			for (int j = i+1; j < list.length; j++)
				if (list[j] > list[maxIndex])
					maxIndex = j;
					//swap list[i] with larges element
		
			int temp = list[i];
			list[i] = list[maxIndex];
			list[maxIndex] = temp;
		}
	}
	
	public void replaceFirst(int oldVal, int newVal) {
		int index = search(oldVal);
		if(index>=0){
			list[index] = newVal;
		}
	}
	public void replaceAll(int oldVal, int newVal) {
		if(oldVal == newVal){
			return;
		}
		int index;
		do{
			index = search(oldVal);
			if(index>=0){
				list[index] = newVal;
			}
		}while(index >= 0);
	}
}