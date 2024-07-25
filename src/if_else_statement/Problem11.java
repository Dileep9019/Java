package if_else_statement;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int digit1 = sc.nextInt();
		int reverse =0;
		while(digit1 > 0) {
			int rem = digit1 % 10;
			reverse = reverse * 10 +rem;
			digit1 /=10;
			
		}
		System.out.println("The number is:"+reverse);
	}
	

}
