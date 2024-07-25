package basics;


public class Operators {
	public static void arithmeticOperator() {
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//quotient
		System.out.println(a%b);//remainder
	}
	
	public static void relationalOperator() {
		int x = 20;
		int y = 40;
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
	}
	
	public static void logicalOperator() {
		int x = 25;
		int y = 40;
		boolean result = !(!(x>y)|| (x==y)&&(x!=y));
		System.out.println(result);
		System.out.println("______________________");
		
	}
	
	public static void unaryOperator() {
		int a = 10;
		int b = ++a;
		
		System.out.println(a+"_______"+b);
		System.out.println("_____________________");
		
		
		int c = 21;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		int x =12;
		int result = ~x;//~x = -(x+1);
		System.out.println("____________");
	
	}
	
	public static void bitwiseOperator() {
		int a = 10;
		int b = 14;
		
		
		int c = 23;
		int d = 67;
		
		System.out.println(c&d);
		System.out.println(a&b);
		System.out.println(a| b);
	
	}
	
	public static void shiftOperator() {
		int num = 10;
		
		System.out.println(num<<5);//num * 2^m
		
		int num1 = 20;
		System.out.println(num>>2);//num/ 2^m
		System.out.println("_____________");
		
		
	}
	
	public static void assignmentOperator() {
		int a = 10;
		a +=20; //a = a+20;
		System.out.println(a);
		
	}
	
	public static void instanceOfOperator() {
		String str = "Java";
		if(str instanceOf String) {
			System.out.println(str.length());
		}
	}
	
	

	public static void main(String[] args) {
	
        Operators.arithmeticOperation();
        Operators.relationalOperation();
        Operators.logicalOperation();
        Operators.unaryOperation();
        Operators.bitwiseOperation();
        Operators.shiftOperation();
        Operators.assignmentOperation();
	}

}
