import java.util.Scanner;

/**
 * Implementation of QuickSort
 * 
 * @author Unknown
 *
 */

public class Quicksort{

	/**
	 * The main method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] array;
		int size = 0;

		//Prompt user to create array and its elements
		System.out.print("Enter the size of the array: ");
		size = input.nextInt();
		array = new int[size];
		for (int i = 0; i < size; i++){
			System.out.print("For index " + i + ", give an integer input: ");
			array[i] = input.nextInt();
		}

		//Output inputted array
		System.out.println("The array is: ");
		printarray(array);
		System.out.println();

		//Run quicksort, and output sorted array
		quicksort(array, 0, array.length - 1);
		System.out.println("The sorted array is: ");
		printarray(array);
		System.out.println();
		
		input.close();
	}
	
	/**
	 * QuickSort method
	 * 
	 * @param ar Array to perform QuickSort
	 * @param start Start of the array
	 * @param end End of the array
	 */
	public static void quicksort(int[] ar, int start, int end){
		int[] array;
		
		int i = start, j = end;
		if (end-start >= 1){
			int pivot = ar[end];
			while (i< j){
				while (ar[i]<pivot && i<end){
					i++;
				}
				while (ar[j]>=pivot && j>start){
					j--;
				}
				if (i<j){
					swap(ar, i, j);
				}
			} swap(ar, end, i);

			quicksort(ar, start, i-1);
			quicksort(ar, i+1, end);
		} else{
			return;
		}
	}

	/**
	 * Helper Method 1 - Swaps elements of an array
	 * 
	 * @param ar Array to be used
	 * @param index1 Index 1 to be switched with Index 2
	 * @param index2 Index 2 to be switched with Index 1
	 */
	public static void swap(int[] ar, int index1, int index2){

		int temp = ar[index1];
		ar[index1] = ar[index2];
		ar[index2] = temp;
	}

	/**
	 * Helper Method 2 - Prints the elements of an array
	 * 
	 * @param array Array to be printed
	 */
	public static void printarray(int[] array){

		for (int data : array){
			System.out.print(data + " ");
		}
	}
}