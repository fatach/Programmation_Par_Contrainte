
public class Min {
	

    static void Print3Smallest(int array[], int n) 
    { 
            int firstmin = Integer.MAX_VALUE; 
            int secmin = Integer.MAX_VALUE;  
            int thirdmin = Integer.MAX_VALUE; 
            for (int i = 0; i < n; i++) 
            { 
                //
                if (array[i] < firstmin) 
                { 
                    thirdmin = secmin; 
                    secmin = firstmin; 
                    firstmin = array[i]; 
                } 
          
                //
                else if (array[i] < secmin) 
                { 
                    thirdmin = secmin; 
                    secmin = array[i]; 
                } 
          
                //
                else if (array[i] < thirdmin) 
                    thirdmin = array[i]; 
            } 
          
           // System.out.println("First min = " + firstmin ); 
            //System.out.println("Second min = " + secmin ); 
            System.out.println("Third min = " + thirdmin ); 
    } 
      
    // Test
    public static void main(String[] args) 
    { 
            int array[] = {3, 2, 10, -2, 15}; 
            int n = array.length; 
            Print3Smallest(array, n); 
    }

}
