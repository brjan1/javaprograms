package java010_pyramidnumberformat1;

public class PyramidNumberFormat1 {

	public static void main(String[] args) {
		
		int n=4;
		for(int rows=1; rows<=n; rows++) {
			for(int cols=1; cols<=(n-rows); cols++) {
				System.out.print(" ");
			}
			for(int cols=1; cols<=rows; cols++) {
				System.out.print(cols);
			}
			for(int cols=rows; cols>=2; cols--) {
				System.out.print(cols-1);
			}
			System.out.println();
		}

	}

}
