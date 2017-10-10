import java.util.Arrays;

/*
 * Prime Seive Algorithm
 * Quickly generate array of prime by seiving through array
 */
public class PrimeSeive {


	public static void main(String[] args){
		boolean[] prime = primeSieve(10000);
		for(int i = 0; i < prime.length; i++){
			if(prime[i]){
				System.out.println(i);
			}
		}
	}

	public static boolean[] primeSieve(int n){
		boolean[] p = new boolean[n];
		Arrays.fill(p, Boolean.TRUE);

//		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int i = 2; i < n; i++){
			if(p[i]){
//				prime.add(i);
				for(int j = i+i; j < n; j = j + i){
					p[j] = false;
				}
			}
		}
		return p;
	}

}
