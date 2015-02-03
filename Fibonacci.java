
public class Fibonacci {
	public static long fib(int n) { 
		if (n <= 1) return n; 
		else return fib(n-1) + fib(n-2); 
		} 

		public static void main(String[] args) { 
		int k; 
		for (k=0;k<=20;k++) 
		System.out.println(k + ": " + fib(k)); 
		} 

}
