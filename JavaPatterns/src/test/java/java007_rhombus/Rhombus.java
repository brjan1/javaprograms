package java007_rhombus;

public class Rhombus {

	public static void main(String[] args) {
		
	int n=4;
	for(int rows=1; rows<=n; rows++) {
		for(int cols=1; cols<=(n-rows); cols++) {
			System.out.print(" ");
		}
		for(int cols=1; cols<=n; cols++) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
