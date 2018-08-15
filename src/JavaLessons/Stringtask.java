package JavaLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class Stringtask {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(-2);
		nums.add(-3);
		List<Integer> base= new ArrayList<Integer>();
		
		//		String g = Stringtask.eliminatePairs("valod");
		//		System.out.println(g);
		for(int i = 0 ; i<nums.size();i++){


			if(nums.get(i) <0) {
				
				base.add(nums.get(i));
			}
    }
		nums.removeAll(base);

			System.out.println(nums);
		}




		static String eliminatePairs(String str) {
		
			for(int i = 0; i<str.length()-1; i++) {

				if(str.charAt(i) == str.charAt(i+1)) {

					str = str.replace(str.substring(i, i+2), "");


				}

			}
			return str;

		}

		public List<Integer> noNeg(List<Integer> nums) {



			List<Integer> base= new ArrayList<Integer>();
			

			for(int i = 0 ; i<nums.size();i++){


				if(nums.get(i) <0) {
					
					base.add(nums.get(i));
				}
	    }
			nums.removeAll(base);

				return nums;
			
		}

	}
