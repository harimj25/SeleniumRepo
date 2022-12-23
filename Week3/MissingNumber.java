package week3.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {
	public static void main(String[] args) {
		int input[]= {10,11,12,13,13,12,11,15,16,17,16,18,19,20,21,23,25,27}; /*input with duplicates and missing number*/
		Set<Integer> iset= new LinkedHashSet<Integer>();
		for (int i=0;i<input.length;i++)
		{
			iset.add(input[i]);
		}
		System.out.println("Elements in set:  "+iset);
		System.out.println("Size of the set is:  "+ iset.size());
		List<Integer> ilist=new ArrayList<Integer>(iset);
		System.out.println("Elements in list :  "+ilist);

		for (int i=0;i<iset.size()-1;i++)
		{
			if((ilist.get(i)+1)==(ilist.get(i+1)))
				continue;
			else
				System.out.println("Missing number is: "+ (ilist.get(i)+1));
		}
	}
}
