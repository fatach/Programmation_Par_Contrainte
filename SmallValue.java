import java.util.Scanner;

public class SmallValue {

	public static void main(String[] args) {
		
		System.out.println(" Enter number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] number= new int[n];
		
		for(int i=0; i<number.length; i++) {
			
			System.out.print("Enter element number No."+(i+1)+":");
			number[i]=scanner.nextInt();	
		}
		      scanner.close();
		     // System.out.println(" Enter number"+ number.toString());
		      
	}
	
	
}
