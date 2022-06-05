package codingame_tests;

import java.util.Arrays;

public class FindLargest {
	
	/**
	 * static int getLargest(int[] numbers){  
	
		Arrays.sort(a);  
		return a[total-1];  
		}  */
	
	static int getLargest(int[] numbers){ 
		int max = numbers[0]; 
		for(int n : numbers){
		    if(n>max) max = n;
		}
		return max;
	}
	public static void main(String[] args) {
		int numbers[]= {1,23,43,0,9,8};
		System.out.println("lagest number is: "+getLargest(numbers));
	}
}
