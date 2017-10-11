
public class IsPalindrome {

	public static void main(String[] args){
		System.out.println("mala' yala m : " + isPalindrome("malayalam"));
		System.out.println("mala' yala m : " + isPalindromeRecur("malayalam"));
	}

	public static boolean isPalindrome(String pal){
		String stem = pal.replaceAll("/[^A-Za-z0-9]/", "");
		boolean check = true;
		for(int i = 0; i < stem.length(); i++){
			if(stem.charAt(i) != stem.charAt(stem.length()-(i+1))){
				check = false;
				break;
			}
		}
		return check;
	}

	public static boolean isPalindromeRecur(String pal){
		String stem = pal.replaceAll("/[^A-Za-z0-9]/", "");
		int n = stem.length();

		if(n == 0){
			return true;
		}

		return isPalRec(stem, 0, n -1);
	}

	public static boolean isPalRec(String stem, int start, int end){
		// One Character left
		if(start == end){
			return true;
		}

		if(stem.charAt(start) != stem.charAt(end)){
			return false;
		} else {
			if(start < end + 1){
				// if there are more than 3 character
				return isPalRec(stem, start+1, end -1);
			}else {
				return true;
			}
		}
	}
}
