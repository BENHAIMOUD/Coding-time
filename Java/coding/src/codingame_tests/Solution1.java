package codingame_tests;


class A{
	void test() {
		System.out.print("Good");
	}
}

class B extends A{
	
}

public class Solution1 {
	
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		b.test();
		
	}
	

}




