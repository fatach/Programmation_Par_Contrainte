import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int List[]= {7,8,10,18,55,3,9,12};
		System.out.println("Avant le trie du tableau on a");
		
		for (int entier: List) {
			System.out.println(+entier);
			
				
		  }
		//Trie du tableau
		System.out.println("Apres le trie du tableau");
		System.out.println("---------------------------");
		Arrays.parallelSort(List);
		for(int entier:List) {
			
			System.out.println(+entier);
		}

	}

}
