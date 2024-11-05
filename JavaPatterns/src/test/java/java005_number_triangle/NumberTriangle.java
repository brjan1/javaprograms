package java005_number_triangle;

public class NumberTriangle {

	public static void main(String[] args) {
		int n=4;
		int num = 1;
		for(int rows=1; rows<=n; rows++) {
			for(int cols=1; cols<=(n-rows); cols++) {
				System.out.print(" ");
			}
			for(int cols=1; cols<=rows; cols++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		

	}

}
