package week3.day1;

import java.util.Map;
import java.util.TreeMap;


public class FindNumbersofOccurance {
	public static void main(String[] args) {
		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};
		/*2->3;3->2;5->1;6->2;1->2;4->1;-1->1 */
		Map<Integer,Integer> inputMap=new TreeMap<Integer,Integer>();
		for (int i=0;i<input.length;i++)
		{
			if(inputMap.containsKey(input[i]))
			{
				Integer existingcount =inputMap.get(input[i]);
			    inputMap.put(input[i], existingcount+1);
			}
		    else {
			//if it doesn't exist,add the number key to the map with 1 as value
			inputMap.put(input[i],1);	
		    }
		}
		System.out.println(inputMap);
		
	}

}
