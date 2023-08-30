/** 
 * File: IntegerList.java 
 * 
 * Define an IntegerList class with methods to create & fill 
 * a list of integers.
 */ 

public class IntegerList {
	
	int[] list; //values in the list
	int currentCount; 
	/** 
	 * create a list of the given size 
	 */ 
	public IntegerList(int size) {
		list = new int[size];
		currentCount = 0;
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
		
		for (int i=0; i<currentCount; i++)
			System.out.println(i + ":\t" + list[i]);
	}

	public void increaseSize(){
		int[] newList = new int[list.length * 2];
		for (int i = 0; i < list.length; i++ ) {
			newList[i] = list[i];
		}
		list = newList;
	}
	public void addElement(int newVal) {
		if(currentCount == list.length){
			increaseSize();
		}
		list[currentCount++] = newVal;
	}
	public void removeFirst(int newVal) {
		int index = -1;
		for (int i = 0; i <= currentCount; i++){
			if(list[i] == newVal){
				index = i;
				break;
			}
		}
		if(index >= 0 ){
			for (int i = index; i < currentCount; i++){
				list[i] = list[i + 1];
			}
			currentCount--;
		}
	}
	public void removeAll(int newVal) {
		int index;
		do{
			index = -1;
			for (int i = 0; i <= currentCount; i++){
				if(list[i] == newVal){
					index = i;
					break;
				}
			}
			if(index >= 0 ){
				for (int i = index; i < currentCount; i++){
					list[i] = list[i + 1];
				}
				currentCount--;
			}
		}while(index >= 0);	
	}

}