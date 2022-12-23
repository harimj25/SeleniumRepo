package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7}; /*input array*/
		Set <Integer> input=new LinkedHashSet<Integer>(); /*declaring set*/
		for(int i=0;i<data.length;i++)
			input.add(data[i]); /*adding data into set with duplicates removed*/
		System.out.println("Size of the set : "+ input.size());
		System.out.println("Elements in the set:  " +input);
        List<Integer> inputlist=new ArrayList<Integer>(input);
        Collections.sort(inputlist);
        System.out.println("Size of a list : " + inputlist.size());
        System.out.println("Second largest element in the given input is : " + inputlist.get(4) );
	
	}
}
