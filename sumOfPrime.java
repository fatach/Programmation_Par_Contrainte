import java.util.Scanner;

public class sumOfPrime {

	public static void main(String[] args) {
		System.out.println(" Enter lenght of Tab\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tab1= new int[n];
        for(int i=0; i<tab1.length; i++) {
			
		System.out.print("Enter elements of tab1."+(i+1)+":");
		tab1[i]=sc.nextInt();	
			
		}
        sc.close();
        int sum =0;
        for(int i = 2; i<tab1.length; i++) {
        if(i%2==0) 
           sum = sum+tab1[i];
           
        
        }
          
       
        System.out.println("la somme des nombres premier est:" + sum );
	}
	
}
