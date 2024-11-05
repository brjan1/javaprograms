package java001_solidrectangle;

public class Solid_Rectangle {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 5;
		for(int rows=1; rows<=n; rows++) {
			for(int cols=1; cols<=m; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
