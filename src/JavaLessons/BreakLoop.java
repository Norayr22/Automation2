package JavaLessons;

public class BreakLoop {
	

	public static void main(String[] args) {
		
		String name = "Hello World";
		boolean find = false;
		char letter = 'H';
		int size = name.length();
		
		for(int i = 0; i<size; i++) {
			if(name.charAt(i) == letter) {
				find = true;
				break;	
			}		
		}
		if(find) {
			System.out.println("FIND");
		}
		else {
			System.out.println("NOT FOUND");
		}
		
		



	}

}
