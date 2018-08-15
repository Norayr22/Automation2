package JavaLessons;

public class LoopJava {
	static int sum = 1;

	public static int calculate(int n) {
		
		
		for(int j = 1; j<=n; j++) {
			sum = sum*j;
			}
		return sum;
			
		
		
		
	}
public static void main(String[] args) {
		LoopJava.calculate(1);
		System.out.println(sum);
			
		
		
		
	}

}
