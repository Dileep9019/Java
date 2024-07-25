package if_else_statement;



public class Problem12 {
	
	public static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reversedNumber =0;
		
		while(num !=0) {
			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			num /= 10;
		}
		return originalNumber == reversedNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int inputNumber = 12461;
		
		if(isPalindrome(inputNumber)) {
			System.out.println(inputNumber + "is Palindrome. ");
		}else {
			System.out.println(inputNumber + " is not Palindrome. ");
		}
		
		

	}

}
