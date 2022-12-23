package week3.day1;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicate {
	public static void main(String[] args) {
		String name = "banjara";
		char[] charArray = name.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		
		for (int i = 0; i < charArray.length; i++)
  {
			
		  if (map.containsKey(charArray[i]))
		  {
			Integer existingcount =map.get(charArray[i]);
			map.put(charArray[i], existingcount+1);
			
		   } else			
             map.put(charArray[i],1);
	}
System.out.println(map);
	
	}
}
