package if_else_statement;

import java.util.Scanner;

public class Temperature {
	
	public static void temp(int n,int a) {
		if(n<20) {
			System.out.println("Cold");
			
		}
		if(n>30) {
			System.out.println("Hot");
		}else {
			System.out.println("Warm");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		temp(a,b);

	}

}
