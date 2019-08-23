import java.util.Scanner;

public class NbPremier {

	public static void main(String[] args) {
		int rest=0;
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0) {
		    n=n/2;
		    rest=n%2;
			System.out.print(n + "n'est pas un nombre premier "); 
            
			
		}
		else {
			System.out.print(n + " est un nombre premier");
		}
        sc.close();
	}
         
}
