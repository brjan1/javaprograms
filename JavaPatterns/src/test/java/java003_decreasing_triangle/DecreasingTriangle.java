package java003_decreasing_triangle;

public class DecreasingTriangle {

	public static void main(String[] args) {
		
		int n=4;
		for(int rows=1; rows<=n; rows++) {
			for(int cols=n-rows+1; cols>=1; cols--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
