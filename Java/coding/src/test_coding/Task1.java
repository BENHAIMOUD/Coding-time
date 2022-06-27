package test_coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * 1-Given A=["Cardiology", "Orthopaedics", "Neurology","Cardiology","Orthopaedics","Cardiology"]
 * the function Should return 3. The department Of Cardiology is occupied theree patients.
 * 2-Given A=["Oncology", "Gynaecology", "Orthopaedics","Oncology","Gynaecology","Orthopaedics"]
 * the function should return 2
 * 3-Given A=["Neurology", "Cardiology", "Oncology"]
 * the function Should return 1
 */
public class Task1 {
	public static int solution(String[] A) {
		// write your code in java SE 8
		//A=["Cardiology", "Orthopaedics", "Neurology","Cardiology","Orthopaedics","Cardiology"]
		ArrayList <String> list = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		int counterMax=0;
		
		//A[1,2,3,4,53,3,2] A[2,3,4,53,3,2]
		for(int i=0; i<A.length; i++) {
			String max = A[i];
			int counter=1;
			for(int j=i+1; j<A.length; j++){
				if(A[j].equals(max)){
					counter++;
				}
			}
			if(counter>counterMax)
				counterMax=counter;
			
		}
		
		return counterMax;
	}
	
	public static void main(String[] args) {
		String A1[] = {"Cardiology", "Orthopaedics", "Neurology","Cardiology","Orthopaedics","Cardiology"};
		String A2[] = {"Oncology", "Gynaecology", "Orthopaedics","Oncology","Gynaecology","Orthopaedics"};
		String A3[] = {"Neurology", "Cardiology", "Oncology"};
		System.out.println(solution(A1));
		System.out.println(solution(A2));
		System.out.println(solution(A3));
	}
	

}
