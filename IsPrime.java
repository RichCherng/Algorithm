
public class IsPrime {

	// A simple quick way to check primality

	// Recommend approach for run-time is to generate prime and check
	// Such as PrimeSeive

	public static boolean prime(int a){
		boolean prime = true;
		for(int i=2; i < a/2; i++){
			if(a % i == 0){
				prime = false;
			}

		}
		return prime;
	}
}


