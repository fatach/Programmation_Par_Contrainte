import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		System.out.println(" Enter lenght of Tab 1\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tab1= new int[n];
        for(int i=0; i<tab1.length; i++) {
			
			System.out.print("Enter elements of tab1."+(i+1)+":");
			tab1[i]=sc.nextInt();	
		}
       
        
        System.out.print("*************************************\n");
        
        System.out.print("Enter lenght of Tab 2\n");
        Scanner cs = new Scanner(System.in);
        int p = cs.nextInt();
		int[] tab2= new int[p];
        for(int i=0; i<tab2.length; i++) {
			
			System.out.print("Enter elements of tab2."+(i+1)+":");
			tab2[i]=cs.nextInt();	
		}
        sc.close();
        cs.close();
        
        //Condition
        if(tab1.length==tab2.length) {
        	System.out.print("The two array are equals");
        }
        else {
        	System.out.print("The two array are not equals");
        }
        
                
        
	}

}
