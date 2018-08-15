package JavaLessons;

public class Loop {

	

			public void printFigure(int n) {     
			 int half = n/2;   
			 String str = ">";  
			 int endInd;        

			 for(int i = 1; i <= n; i++) {    
			    System.out.println(str);   
			    if (n%2==0) {    
			      if(i <= half) {   
			         str = str + ">>";    
			      }
			      endInd = str.length()-2; 
			      if((endInd >= 0) && (i >= half)){  
			         str = str.substring(0, endInd); 
			      }
			    }
			    else {          
			      if(i < half+1) {  
			          str = str + ">>"; 
			       }
			      endInd = str.length()-2;    
			       if((endInd >= 0) && (i > half)) {  
			        str = str.substring(0, endInd);  
			      }
			    }
			 }
			 
			}
			
			public static void main(String[] args) {
				Loop n = new Loop();
				n.printFigure(100);
			}

}
