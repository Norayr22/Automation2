package JavaLessons;

public class nnn {
	static String b = ">";
	public static void print(int n) {
		for(int i =0; i<=n/2; i++) {
			for(int j = 1; j<= i; j++) {
			System.out.print(b);
		
			}
			System.out.println("");
		}
		for(int k = n/2; k>=0; k--) {
			for(int c = k; c>=0; c--) {
				System.out.print(b);
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		
		nnn.print(10);
		

	}

}
