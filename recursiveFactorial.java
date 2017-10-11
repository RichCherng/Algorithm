
public class recursiveFactorial {

	public static void main(String[] args){

		System.out.println("5! = " + recFactorial(5));
		System.out.println("4! = " + recFactorial(4));
		System.out.println("17! = " + recFactorial(17));
	}

	public static long recFactorial(int n){

		if (n == 0){
			return 1;
		} else {
			return (long)n * recFactorial(n-1);
		}
	}
}
