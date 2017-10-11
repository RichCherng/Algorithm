
public class SelectionSort {

	public static void main(String[] args){
		int[] arr1 = {10,34,2,56,7,67,88,42};
		selectionSort(arr1);
		for(int i : arr1){
			System.out.print(i + " ");
		}
	}


	public static void selectionSort(int[] arr){

		for(int i = 0; i < arr.length; i++){
			int val = arr[i];
			int min = val;
			int index = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < min){
					min = arr[j];
					index = j;
				}
			}
			int temp = val;
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}
}
