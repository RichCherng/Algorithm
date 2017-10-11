
public class PerfectSquare {

	public static void main(String[] args){

		long[] perfectSquare = generateSquare(50);

		for(long i : perfectSquare){
			System.out.println(i);
		}
	}

	public static long[] generateSquare(int n){
		long[] list = new long[n];

		long odd = 1;
		for(int i = 1; i < n; i++){
			list[i] = list[i-1] + odd;
			odd += 2;
		}

		return list;
	}
}
