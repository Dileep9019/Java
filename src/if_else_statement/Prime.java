package if_else_statement;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		if(num%1==0 && num%num==0) {
			System.out.println("It is prime number");
		}else {
			System.out.println("It is not prime number");
		}

	}

}
