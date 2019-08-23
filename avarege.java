
public class avarege {

	public static void main(String[] args) {
		int tab[]= {4,5,10,8,15,20}; 
		int min = tab[0];
		int max= tab[0];
		float sum = tab[0];
		
		for (int i=0; i<tab.length; i++) {
			sum = sum + tab[i];
			if (tab[i]> max) 
				max =tab[i];
				else if (tab[i]< min) 
					min = tab[i];
			
		    }
		float moyenne = (sum -max -min) /(tab.length -2);
		System.out.print("la moyenne est:" + moyenne);
			  

	}

}
