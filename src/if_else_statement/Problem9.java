package if_else_statement;

import java.util.Scanner;

public class Problem9 {

	public static void prime_number(int a, int b) {
		boolean prime;
		for(int i=a; i<=b; i++) {
			if(i==1 || i==0) {
				continue;
			}
			prime = true;
			for(int j=2; j<=i/2; j++) {
				if(i % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime == true) {
				System.out.println("the prime numbers are: " +i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower number");
		int lower1 = sc.nextInt();
		System.out.println("Enter the upper number");
		int upper1 = sc.nextInt();
		Problem9.prime_number(lower1 , upper1);

	}

}
