package if_else_statement;

public class Problem3 {

	public static int SumOfNaturalNumber(int N) {
		int sum =0;
		for(int i=1; i<=N; i++) {
			sum +=i;
		}return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N =10;
		int sum = SumOfNaturalNumber(N);
		
		System.out.println(sum);
	}

}
