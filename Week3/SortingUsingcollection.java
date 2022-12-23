package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class SortingUsingcollection {
	public static void main(String[] args) {
		String [] inputArray= {"Google","Microsoft","TestLeaf","Maverick","Amazon", "HCL" , "CTS", "Aspire Systems"};
		Set<String> inputset=new TreeSet<String>();
		for (int i=0;i<inputArray.length;i++)
			inputset.add(inputArray[i]);
		String [] outputArray=inputset.toArray(new String[inputset.size()]);
		System.out.println(inputset.size());
		for (int i=0;i<inputset.size();i++)
			System.out.println(outputArray[i]);
		
		
	}
}
