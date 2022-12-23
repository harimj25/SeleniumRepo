package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueNumber {
	public static void main(String[] args) {
		
		String name="HariPrasad";
		char[] array=name.toCharArray();
		Set<Character> inputset=new HashSet<Character>();
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			inputset.add(array[i]);
		}
		System.out.println(inputset.size());
		Character[] setArray = inputset.toArray(new Character[inputset.size()]);
		System.out.println("Unique characters in given string is:");
		for (int i=0;i<setArray.length;i++)
			System.out.print(setArray[i]);
			
	}
}
