package basics;

public class recursion_4 {
    public static int fact(int n) {
    	if(n==0) {
    		return 1;
    	}
    	return fact(n-1)*n;
    }
    public static int pow(int a, int b) {
    	if(b==0) {
    		return 1;
    		
    	}
    	return pow(a,b-1)*a;
    }
    public static int fib(int n)
    {
    	if(n==0 || n==1) {
    		return n;
    	}
    	return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(pow(2,3 ));
		System.out.println(fib(4));
		 

	}

}
