package java008_diamond;

public class Diamond {

	public static void main(String[] args) {
		
		int n = 4;
		//upper half
		for(int rows=1; rows<=n; rows++) {
			for(int cols=1; cols<=(n-rows); cols++) {
				System.out.print(" ");
			}
			for(int cols=1; cols<=rows; cols++) {
				System.out.print("*");
			}
			for(int cols=2; cols<=rows; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
				for(int rows=n-1; rows>=1; rows--) {
					for(int cols=1; cols<=(n-rows); cols++) {
						System.out.print(" ");
					}
					for(int cols=1; cols<=rows; cols++) {
						System.out.print("*");
					}
					for(int cols=2; cols<=rows; cols++) {
						System.out.print("*");
					}
					System.out.println();
				}

	}

}