import java.util.Arrays;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		System.out.print("Enter the lenght of the array: "); 
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int[] array= new int[n];
		int i=0;
		for(i=0; i< array.length; i++) {
			System.out.print("enter element of array"+(i+1)+": ");
			array[i]=sc.nextInt();
			
		}
		
		int S =15;
		//int sum=0;
		//int array1[]= {};
		for(i=0; i<array.length; i++) {
			int a1=array[i];
			for(int j=1 ;j<array.length;j++) {
				int a2=array[j];
				//array1[]=array[i++];
				if((a1+a2)==S) {
					//Affichage des couples dont la somme donne S
					System.out.printf("(%d, %d) %n", a1, a2);
						
				}
				
				
			}
				
		}
		sc.close();
	}

}
