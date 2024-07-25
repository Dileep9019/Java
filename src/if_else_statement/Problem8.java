package if_else_statement;

import java.util.Scanner;

public class Problem8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check prime or not");
		int num =sc.nextInt();
		boolean prime = false;
		for(int i=2; i<=num/2; i++) {
			if(num % i ==0) {
				prime = true;
				break;
			}
		}
		
		if(!prime) {
			System.out.println(num+ " is prime number");
		}else {
			System.out.println(num+ " is not a prime number");
		}
			
		
		
	

	}

}
