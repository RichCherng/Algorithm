import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		int num = Integer.parseInt(reader.nextLine());
		for(int i = 0; i < num; i++)
			System.out.println(fib(num));
	}
	
	public static int fib(int num){
		
		if(num < 2)
			return num;
		return fib(num - 2) + fib(num - 1);
	}
}
