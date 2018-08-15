package JavaLessons;

public class StringExcerscise {


	    
		   public static void main(String[] args)
		    {
		        StringExcerscise.cut("Babken");
		    }
		   
		   public static void cut(String str) {
			   String result = "";
			   for(int i = 0; i<str.length(); i=i+2) {
				   result = result +str.charAt(i);
				   
				   
			   }
			   System.out.println(result);
			   
		   }
		}