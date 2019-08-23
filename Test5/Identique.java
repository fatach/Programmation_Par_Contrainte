import java.util.Scanner;

public class Identique {

	
	
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
		int j=0;
		for(i=0;i<array.length;i++) {
			for(j=i+1; j<array.length; j++) {
				
				if(array[i]==array[j]) {
					
					System.out.print("The double element of this array is:"+array[i] + " ");
				}
			}
		}
		
       
	}

}
