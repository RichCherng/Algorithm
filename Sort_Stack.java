import java.util.Arrays;
import java.util.Stack;

public class Sort_Stack {

	static int[] list_1 = {10,9,8,7,6,5,4,3,2,1};
	static int[] list_2 = {1,2,3,4,5,6,7,8,9,10};
	static int[] list_3 = {51, 100, 1, 10, 456, 2, 456,35,75,68,15,95,32,1};
	static int[] list_4 = {5,9,4,6,3,1,2};

	static boolean DESC = false;
	static boolean ASC = true;

	public static void main(String[] args){

		Stack<Integer> stack = new Stack<Integer>();
		for(int v: list_4){
			stack.push(v);
		}

		System.out.println(Arrays.toString(stack.toArray()));
//		stack = sortStack(stack, ASC);
		sortStackRecur(stack);
		System.out.println(Arrays.toString(stack.toArray()));
		 // Convert Stack to Array then to string.
	}

	public static Stack<Integer> sortStack(Stack<Integer> stack, boolean order){
		Stack<Integer> t_stack = new Stack<Integer>();
		int temp;
		t_stack.push(stack.pop()); // Pop first element in t_stack

		while(!stack.isEmpty()){

			// if top of the first stack is greater than second
			while( !stack.isEmpty() && (stack.peek() > t_stack.peek()) ){
				t_stack.push(stack.pop());
			}

			if(!stack.isEmpty() && stack.peek() < t_stack.peek()){
				temp = stack.pop();

				while(!t_stack.isEmpty() && temp < t_stack.peek()){
					stack.push(t_stack.pop());

				}
				t_stack.push(temp);
			}
		}

//		System.out.println(Arrays.toString(t_stack.toArray()));
		if(order){
			stack = t_stack;
		} else{
			while(!t_stack.isEmpty()){
				stack.push(t_stack.pop());
			}
		}

		return stack;
	}

	public static void sortStackRecur(Stack<Integer> stack){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			sortStackRecur(stack);
			sortedInsert(stack, temp);
		}
//		return stack;
	}

	public static void sortedInsert(Stack<Integer> stack, int t){
		if(stack.isEmpty() || t > stack.peek()){
			stack.push(t);
		} else {
			int temp = stack.pop();
			sortedInsert(stack, t);
			stack.push(temp);
		}
	}
}
