package if_else_statement;

import java.util.Scanner;

public class Problem7 {
	
	public static boolean Check_Leap(int x) {
		if(x % 4 ==0) {
			if(x % 100==0) {
				if(x % 400 ==0) {
					return true;
				}else {
					return false;
				}
				
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Check leap or not");
		int year = sc.nextInt();
		boolean Leap = Problem7.Check_Leap(year);
		System.out.println("enter the number"+Leap);

	}

}
