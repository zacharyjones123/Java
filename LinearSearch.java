import java.util.Scanner;

public class LinearSearch{
	/**
	 * The main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int[] myArray;
		int size = 0;

		//Prompt user to create array and its elements
		System.out.print("Enter the array size: ");
		size = input.nextInt();
		myArray = new int[size];
		for (int i = 0; i < size; i++){
			System.out.print("For index " + i + ", enter an integer: ");
			myArray[i] = input.nextInt();
		}

		//Prompt user to search for particular element
		System.out.print("Enter integer to search for: ");
		int key = input.nextInt();

		//Output array and index of target element, if found
		printarray(myArray);
		System.out.printf("The integer %d is found in index %d\n", key, linearsearch(myArray, key));
		
		input.close();
	}

	/**
	 * Linear search method
	 * 
	 * @param list List to be searched
	 * @param key Key being searched for
	 * @return Location of the key
	 */
	public static int linearsearch(int[] list, int key){

		for (int i = 0; i< list.length; i++){
			if (list[i] == key){
				return i;
			}
				
		} return -1;	
	}
	/**
	 * Helper Method
	 * 
	 * @param a array to be printed
	 */
	public static void printarray(int[] a){
		System.out.print("The array is: ");
		for( int d: a){
			System.out.print(d+" ");
		}
		System.out.println();
	}
}