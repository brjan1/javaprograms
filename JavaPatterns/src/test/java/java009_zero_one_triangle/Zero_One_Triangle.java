package java009_zero_one_triangle;

public class Zero_One_Triangle {

	public static void main(String[] args) {
		
		int n=4;
		for(int rows=1; rows<=n; rows++) {
			for(int cols=1; cols<=rows; cols++) {
				if((rows+cols)%2==0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
