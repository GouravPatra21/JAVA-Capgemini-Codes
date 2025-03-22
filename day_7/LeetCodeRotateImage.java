package day_7;

public class LeetCodeRotateImage {
	    public void rotate(int[][] matrix) {
	        int n = matrix.length;
	        int rowi = 0;
	        int rowf = n - 1;
	        while(rowi < rowf) {
	        	for(int col = 0; col < rowf; col++) {
	        		int temp = matrix[rowi][col];
	        		matrix[rowi][col] = matrix[rowf][col];
	        		matrix[rowf][col] = temp;
	        		rowi++;
	        		rowf--;
	        	}
	       }
	        
	       for(int row = 0; row < n; row++) {
	    	   for(int col = row + 1; col < n; col++) {
	    		   int temp = matrix[row][col];
	    		   matrix[row][col] = matrix[col][row];
	    		   matrix[col][row] = temp;
	    	   }
	       }
	}

}
