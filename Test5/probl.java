import java.util.Arrays;

public class probl {


	 static void trouverpair(int[] tableau) 
	    { 
	        int size = tableau.length; 
	        Arrays.sort(tableau);
	        // Recherche de pair de nombre 

	     System.out.print("Le pair est le couple: "+ "( "+tableau[0]+", "+ tableau[size-1]+" )");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Determine le pair d'un nombre dans un tableau: ");
      int arr[] = {4, 14, 32, 60, 152, 140}; 
     
      trouverpair(arr);
	}
}
