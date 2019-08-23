import java.util.Scanner;

public class SumNbImpaire {

	public static void main(String[] args) {
		
		System.out.println(" Enter lenght of Tab 1\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tab= new int[n];
        for(int i=0; i<tab.length; i++) {
			
			System.out.print("Enter elements of tab1."+(i+1)+":");
			tab[i]=sc.nextInt();	
		}
        //Test de condition
         int tabi[]= {0};
         int sum;
         for (int i=0; i<tab.length; i++) {
        	 if(i%2==0) {
        		 //System.out.print("Pas de nombre impaire");
        	 }
        	 else {
        		 tabi[0]= tab[i];
        		 sum=sum(i);
        		 System.out.print("Sum:"+sum);
        	 }
         }
        
        
        sc.close();
	}

	private static int sum(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
