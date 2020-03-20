/**
 * 
 */
package experiments;

/**
 * @author user
 *
 */
public class RecursionExp {

	/**
	 * 
	 */
	public RecursionExp() {
		// TODO Auto-generated constructor stub
	}
	public int power(int base, int exp) {
		int r = -1;
		
		if(exp == 0)
			r = 1;
		if(exp == 1)
			r = base;
		if (exp > 1) {
			r = base*power(base, exp-1);
		}
		return r;
	}
	
	public int factorial(int num) {
		int r =-1;
		
		if(!(num >0)) {
			return 1;
		}
				
		if(num>1) {
			r = num * factorial(num-1);
		}
		
		return Math.abs(r);
		
		
	}
	
	public int fact(int n) {
		int r =-1;
		
		if(n==0|n==1){
			r=1;
		}else {
			r = n * fact(n-1);
		}
		
		return r;
	}
	
	public int fibonacci(int n) {
		int r = -1,n1 = 1,n2 = 1;
		
		if(n1 ==n || n2 ==n) {
			r = n1;
		}else {
			n1+=n2;
			n2 +=n1;
			r = n + fibonacci(n-1);
		}
		
		
		
		return r;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursionExp RE = new RecursionExp();
		System.out.println("2^5 =" + RE.power(2,5));
		System.out.println("5! = " + RE.fact(5));
		System.out.println("The 10th Fib = " + RE.fibonacci(10));
		

	}

}
