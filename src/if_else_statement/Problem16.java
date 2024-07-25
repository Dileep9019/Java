package if_else_statement;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int a =0;
		int b = 1;
		System.out.println("Fibonacci Series : ");
		for(int i=0; i<=num-2; i++) {
			int c = a + b;
			a = b;
			b = c;
			
		}
		System.out.println(b);

	}

}
