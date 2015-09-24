import java.util.Scanner;

/*
 * Longest Common Subsequnce
 * 
 * Dynamic Programming using 2D array
 * 
 */

public class LongestCommonSubsequence {

	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String[] read;
		String word1, word2;
		
		while(reader.hasNextLine()){
			
			read = reader.nextLine().split("\\s+");
			word1 = read[0].toUpperCase();
			word2 = read[1].toUpperCase();
			int[][] chart = new int[word2.length()+1][word1.length()+1];
			
			for(int i = 1; i <= word2.length(); i++){
				for(int j = 1; j <= word1.length(); j++){
					if(word2.charAt(i-1) == word1.charAt(j-1)){
						chart[i][j] = chart[i-1][j-1] + 1;
					} else {
						chart[i][j] = max(chart[i-1][j], chart[i][j-1]);
					}
						
				}
			}
			String sub = "";
			for(int i = word2.length();i > 0; i--){
				for(int j = word1.length();j > 0; j--){
					if(chart[i][j] > max(chart[i-1][j],chart[i][j-1])){
						sub = word1.charAt(j-1) + sub;
						i--;
						j--;
					}
					
				}
			}
			
			System.out.println(sub);
		}
	}
	
	public static int max(int a, int b){
			return (a > b)? a:b;
	}
}
