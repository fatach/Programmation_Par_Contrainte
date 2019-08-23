import java.util.Arrays;

public class pb4 {

	public static void main(String[] args) {
		int[] tableau1 = {1, 1, 6, 5, 3, 2, 7, 4};
		affaicher_coupe(tableau1, 9); 

	}
	
	public static void affaicher_coupe(int[] tab, int som){ 
		System.out.println("tableau " + Arrays.toString(tab));
		System.out.println("Soit le nombre suivant : " + som);
		System.out.println("la somme de coupe de deux valeurs qui verifie le nombre : " + som); 
		pair_nb(tab, som);
		} 
	
	
	public static void pair_nb(int[] arr, int somme) { 
		for (int i = 0; i < arr.length; i++) { 
			int val1 = arr[i]; 
			for (int j = i + 1; j < arr.length; j++) {
				int val2 = arr[j]; if ((val1 + val2) == somme) { 
					System.out.printf("(%d, %d) %n", val1, val2); 
					} 
				}
			} 
		} 

}
