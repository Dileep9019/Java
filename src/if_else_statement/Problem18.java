package if_else_statement;

import java.util.Scanner;

public class Problem18 {

	public static int pow(int n, int a) {
		if(a==0) {
			return 1;
		}
		return pow(n,a-1)*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base number");
		int num = sc.nextInt();
		System.out.println("Enter the power number");
		int a = sc.nextInt();
		System.out.println("The power of number is"+pow(num, a));

	}

}
