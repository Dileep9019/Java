package if_else_statement;

import java.util.Scanner;

public class Problem25 {

	public static int  getDivisorsSum(int num) {
		int sum = 0;
		for(int i=1; i<num; i++)  {
			if(num % i ==0) 
				sum = sum + i;
			
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		int gcd1 =getDivisorsSum(num1);
		int gcd2= getDivisorsSum(num2);
		if(gcd1/num1 == gcd2/num2) {
			System.out.println("numbers in the pair  ");
		}else {
			System.out.println("numbers in not in the pair..  ");
		}

	}

}
