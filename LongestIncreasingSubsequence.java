import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class LongestIncreasingSubsequence {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		String[] read;
		int[] num;
		ArrayList<Stack<Integer>> stack;
		
		while(reader.hasNextLine()){
			
			read = reader.nextLine().split("\\s+");
			stack = new ArrayList<Stack<Integer>>();
			//Create int[] for easier comparison
			num = new int[read.length];
			
			//Go through all values input and create stack when visit
			for(int i = 0 ; i < read.length; i++){
				//Create new stack
				stack.add(new Stack<Integer>());
				//convert to int
				num[i] = Integer.parseInt(read[i]);
				//push that int into top of new stack
				stack.get(i).push(num[i]);
				
				for(int j = i; j > 0; j--){
					//Maximum reached for j = 0
					//Always skiping the first visited stack
					if(j == i)
						continue;
					if(num[j] < num[i]){
						//If this num is greater than the top of stack num
						if(num[j] > stack.get(i).peek()){
							
						}
						
						stack.get(i).push(num[j]);
					}
					
				}
			}
		}
	}

}
