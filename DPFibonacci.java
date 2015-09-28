import java.util.ArrayList;
import java.util.Scanner;


public class DPFibonacci {
	
	public static void main(String[] args){
		
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(1);
		fib.add(1);
		Scanner reader = new Scanner(System.in);
		int N;
		
		while(reader.hasNextLine()){
			N = Integer.parseInt(reader.nextLine());
			System.out.println(fib(N,fib));
		}
	}
	
	public static int fib(int n,ArrayList<Integer> memo){
		int f ;
		if (memo.size() >= n){
			return memo.get(n-1);
		} else {
			if( n <= 2){
				f = 1;
			} else{
				f = fib(n-1,memo) + fib(n-2,memo);
			}
		}
		memo.add(f);
		return f;
	}
}
