import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
	/*This program give an array a[]
 	 * of N double values and find the farthest pair
	 * 
	 */

	public static void main(String[] args) {
		System.out.print("Enter the lenght of the array: "); 
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int [] array= new int[n];
		int i=0;
		for(i=0; i< array.length; i++) {
			System.out.print("enter element of array"+(i+1)+": ");
			array[i]=sc.nextInt();
			
		}
		sc.close();
		int size = array.length; 
		Arrays.sort(array);
		System.out.print("The farthest pair of the double values is: "+ "( "+array[0]+", "+ array[size-1]+" )");
		
   }
}