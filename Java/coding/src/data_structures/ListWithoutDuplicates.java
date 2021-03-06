package data_structures;
import java.util.ArrayList;
import java.util.Arrays;
public class ListWithoutDuplicates {
	
	static Object[] listFilter(int list[]) {
		
	    Arrays.sort(list);
	    ArrayList<Integer> array = new ArrayList<Integer>();
	    for(int i : list) {
	    	if(!array.contains(i))
	    		array.add(i);
	    }
	
		return array.toArray();
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 13, 7, 7, 45, 21, 9, 21, 102 };
	    Object[] list ;
		list= listFilter(arr);
		System.out.printf("Array: %s", Arrays.toString(list));
		
	}

}
