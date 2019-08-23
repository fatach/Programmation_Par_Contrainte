import java.util.Scanner;

public class Problem1 {

	/*This program give the sorted order on two 
	 * two sorted array of N int values
	 * 
	 * 
	 */
public static void main(String[] args) {
		
		System.out.println(" Enter lenght of Tab 1\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tab1= new int[n];
        for(int i=0; i<tab1.length; i++) {
			
			System.out.print("Enter elements of tab1."+(i+1)+":");
			tab1[i]=sc.nextInt();	
		}
        
        System.out.print("Enter lenght of Tab 2\n");
        Scanner cs = new Scanner(System.in);
        int p = cs.nextInt();
		int[] tab2= new int[p];
        for(int i=0; i<tab2.length; i++) {
			
			System.out.print("Enter elements of tab2."+(i+1)+":");
			tab2[i]=cs.nextInt();	
		}
        
        int n1=tab1.length;
        int n2=tab2.length;
        int [] tab3=new int[n1+n2];
        
        int i=0; int j=0; int k=0;
     // parcours des deux tableaux
        while (i<n1 && j <n2) 
		{ 
        	//verification
			if (tab1[i] < tab2[j]) 
				tab3[k++] = tab1[i++]; 
			else
				tab3[k++] = tab2[j++]; 
		} 
        //stocker les elements restant du premier tableau
        while (i < n1) 
			tab3[k++] = tab1[i++]; 
        
      //stocker les elements restant du deuxieme tableau
        while (j < n2) 
			tab3[k++] = tab2[j++]; 
       
        System.out.println("Elements of the two arrays in sorted order are:"); 
		for (int i1=0; i1 < n1+n2; i1++) {
		System.out.print(tab3[i1] + " "); 
        
		}
        
        sc.close();
        cs.close();
        
   }


}
