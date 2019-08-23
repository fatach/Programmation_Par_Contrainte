import java.util.Random;

public class NbAleatoire {

	public static void main(String[] args) {
		int valeurMin=1;
		int valeurMax=31;
		Random r = new Random();
		int valeur = valeurMin + r.nextInt(valeurMax - valeurMin);
		System.out.print("Le nombre ci-dessous est un nombre choisi aleatoirement entre 1 et 31:"+valeur);
		//System.out.print(valeur);


	}

}
