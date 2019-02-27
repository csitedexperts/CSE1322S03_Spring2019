package recursiveMethods;
/*Example of Recursive Method */

public class RecursiveFactorial {
	public static void main(String args[]) {
		int n=500; 
		System.out.print("Factorial of "+ n +" is : "+ fact(n));
	}  

	static int fact(int n) {
		if (n == 1)
			return 1;
		else{
			return n * fact(n-1);  // recursion makes here
		}
	}
}  

