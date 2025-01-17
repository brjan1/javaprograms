package java004_butterfly_pattern;

public class Butterfly_Pattern {

	public static void main(String[] args) {
		
		int n=4;
		
		//upper half
	    for(int rows=1; rows<=n; rows++) {
	    	for(int cols=1; cols<=rows; cols++) {
	    		System.out.print("*");
	    	}
	    	for(int cols=1; cols<=2*(n-rows); cols++) {
	    		System.out.print(" ");
	    	}
	    	for(int cols=1; cols<=rows; cols++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	  //lower half
	    for(int rows=n-1; rows>=1; rows--) {
	    	for(int cols=1; cols<=rows; cols++) {
	    		System.out.print("*");
	    	}
	    	for(int cols=1; cols<=2*(n-rows); cols++) {
	    		System.out.print(" ");
	    	}
	    	for(int cols=1; cols<=rows; cols++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	}
}
