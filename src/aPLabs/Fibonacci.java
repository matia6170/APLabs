package aPLabs;

public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
	
	public static void main(String[] args) {
		System.out.println(Fibonacci.fibonacciRecursion(2));
	}

}
