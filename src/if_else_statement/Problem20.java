package if_else_statement;

import java.util.Scanner;

public class Problem20 {

	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return fact(n-1)*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : " );
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num > 0) {
			int r = num % 10;
			sum += fact(r);
			num /= 10;
		}
		
		if(temp == sum) {
			
			System.out.println(" the number is strong number : ");
			
		}else {
			System.out.println(" the number is not strong number : ");
			
		}

	}

}
