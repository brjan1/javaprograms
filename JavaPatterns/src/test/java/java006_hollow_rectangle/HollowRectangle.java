package java006_hollow_rectangle;

public class HollowRectangle {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 5;
		for(int rows=1; rows<=n; rows++) {
			for(int cols=1; cols<=m; cols++) {
				if(rows==1 || rows==n || cols==1 || cols==m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
