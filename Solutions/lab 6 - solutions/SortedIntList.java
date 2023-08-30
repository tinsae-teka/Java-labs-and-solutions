public class SortedIntList extends IntList{
	public SortedIntList(int size) {
		super(size);
		for (int i = 0; i < size; i++ ) {
			list[i] = Integer.MAX_VALUE;
		}
	}
	public void add(int value) {
	
		if (numElements == list.length)
			System.out.println("Can't add, list is full");
		else {
			int i = numElements+1;
			while(i > 0 && list[i] >= value){
				list[i] = list[i-1];
				i--;
			}
			list[i] = value;
			numElements++;
		}
	}
}