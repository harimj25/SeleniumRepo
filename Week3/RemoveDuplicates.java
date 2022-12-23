package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {  
		String input = "Hari Prasad";
		char[] inputArray = input.toCharArray();
		Set<Character> charset=new LinkedHashSet<Character>();
		Set <Character> dupset=new LinkedHashSet<Character>();
		for (int i=0;i<inputArray.length;i++)
		  charset.add(inputArray[i]);
		
		//Character[]outputArray=charset.toArray(new Character[charset.size()]);
		for (Character eachChar : dupset) {
			if (charset.contains(eachChar)) {
				charset.remove(eachChar);
			}
		}

		for (Character eachChar : charset) {
			if (eachChar != ' ') {
				System.out.print(eachChar + " ");
			}

		}
		System.out.println(dupset.size());
			
	}
	
}
