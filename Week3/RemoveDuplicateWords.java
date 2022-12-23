package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] inputArray=text.split(" ");
		Set<String> inputset=new LinkedHashSet<String>();
		for (int i=0;i<inputArray.length;i++)
		{
			System.out.println(inputArray[i]);
		inputset.add(inputArray[i]);
		}
		System.out.println(inputset.size());
		String[] setArray = inputset.toArray(new String[inputset.size()]);
		System.out.print("Given input without duplicates:  ");
		for(int i=0;i<setArray.length;i++)
			System.out.print(setArray[i]+ " ");
		
	}
}
