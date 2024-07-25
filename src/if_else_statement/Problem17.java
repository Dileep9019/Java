package if_else_statement;

import java.util.Scanner;

public class Problem17 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		long fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial number"+fact);

	}

}
