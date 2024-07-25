package if_else_statement;

public class Test4 {

	public static void isPositiveEven(int num) {
		if(num>0) {
			if(num%2==0) {
				System.out.println("Positive Even number");
				
			}
		else {
			System.out.println("Positive odd number");
		} 
		}else {
			System.out.println("negetive number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         isPositiveEven(-24);
	}

}
