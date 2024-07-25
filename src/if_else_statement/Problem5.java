package if_else_statement;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		System.out.println("enter the start number of interval");
		
		int end = sc.nextInt();
		System.out.println("enter the end number of interval");
		
		int sum = Problem5(start, end);
		System.out.println("The Sum of numbers from" + start + " to " + end + " is: " +sum);



	}
	public static int Problem5(int start, int end) {
		 int sum = 0;
		 for(int i = start; i<=end; i++) {
			 sum += i;
		
		 }
		 return sum;
		
	}

}
