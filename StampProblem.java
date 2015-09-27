import java.util.ArrayList;
import java.util.Scanner;

/**
 * Stamp Problem
 * 
 * @author Pongsathorn Cherngchaosil
 *
 */
public class StampProblem {

	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		
		String[] stamp ;
		int total;
		int minStamp = 99;
		ArrayList<ArrayList<String>> tStamp = new ArrayList<ArrayList<String>>();
		ArrayList<String> curMin = null;
		
		stamp = reader.nextLine().split("\\s+");
		total = Integer.parseInt(reader.nextLine());
		
		
		for(int i = 0; i < stamp.length; i++){
			ArrayList<String> set = new ArrayList<String>();
			int value = total;
			
			if(Integer.parseInt(stamp[i]) > value){
				set = null;
				continue;
			}
			for(int j = i; j < stamp.length; j++){
				//If the current visiting stamp is greater than the overall needed
				while(value >= Integer.parseInt(stamp[j])){
					value -= Integer.parseInt(stamp[j]);
					set.add(stamp[j]);
				}
				if(curMin != null){
					if(set.size() > curMin.size())
						break;
				}
			}
			if(curMin != null){
				//short circuit
				if((set != null) && (set.size() < curMin.size())){
					curMin = set;
				}
			} else{
				curMin = set;
			}
		}
		System.out.println(curMin);
	}
}
