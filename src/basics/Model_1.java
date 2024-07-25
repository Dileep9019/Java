package basics;

public class Model_1 {
    //fuction_definition
	public void m1() {
		System.out.println("m1() called");
	}
	
	public static void m2() {
		System.out.println("m2() called");
	}
	
	public void add(int n1,int n2) {
		System.out.println(n1+n2);
		return ;
	}
	public static void main(String[] args) {
		
		Model_1 obj = new Model_1();
		obj.m1();
		Model_1.m2();
		
		obj.add(12,13);

	}
    
	
}

