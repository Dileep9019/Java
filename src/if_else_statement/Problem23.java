package if_else_statement;

import java.util.Scanner;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int digit = sc.nextInt();
		int num = digit;
		int sum = 0;
		while(digit> 0) {
			int rem = digit % 10;
			sum += rem;
			digit /=10;
		}
		if(num%sum ==0) {
			System.out.println("number is harshad number :");
		}else {
			System.out.println("number is not harshad number :");
		}

	}

}
