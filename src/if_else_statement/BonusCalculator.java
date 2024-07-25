package if_else_statement;

import java.util.Scanner;

public class BonusCalculator {
	public static double bonusNet(double salary ,int year) {
		double bonus = 0.0; 
		if(year > 5) {
			bonus = salary * 0.05;
		}
		return bonus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated meth-od stub

		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter your Salary");
		double Salary = sc.nextDouble();
		
		System.out.println("Enter your year of Service");
		int  yearOfService = sc.nextInt();
		
		sc.close();
		double res = BonusCalculator.bonusNet(Salary, yearOfService);
		System.out.println(res);
		
		
	}


}
