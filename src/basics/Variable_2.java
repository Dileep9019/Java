package basics;

public class Variable_2 {
    static int data =200;//static variable
	public static void main(String[] args) {
		System.out.println(Variable_2.data);
		
		//not recommended
		Variable_2 obj = new Variable_2();
		Variable_2 obj2 = new Variable_2();
		Variable_2 obj3 = new Variable_2();
		System.out.println(obj.data);

		
		System.out.println("_____________________");
		System.out.println("Before modification");
		System.out.println("obj.data");
		System.out.println("obj2.data");
		System.out.println("obj3.data");
	}

}
