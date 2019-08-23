
public class Problem3 {
	
	//
    static int min(int x, int y, int z) 
    { 
        if (x < y) 
            return (x < z) ? x : z; 
        else
            return (y < z) ? y : z; 
    }  
      
   //
    static int minPath(int path[][], int m, 
                                     int n) 
    { 
        if (n < 0 || m < 0) 
            return Integer.MAX_VALUE; 
        else if (m == 0 && n == 0) 
            return path[m][n]; 
        else
            return path[m][n] +  
                min( minPath(path, m-1, n-1), 
                     minPath(path, m-1, n),  
                     minPath(path, m, n-1) ); 
    } 

	public static void main(String[] args) {
		int path[][] = { {5, 7, 9}, 
                {6, 10, 12}, 
                {8, 14, 16} }; 
                  
		System.out.print(minPath(path, 2, 2)); 
		

	}

}
