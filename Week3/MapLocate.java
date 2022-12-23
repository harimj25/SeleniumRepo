package week3.day1;

import java.util.HashMap;
import java.util.Map;
public class MapLocate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="Amazon ,Bangalore";
		char[] charInputArray = input.toCharArray();

		Map<Character,Integer> inputMap = new HashMap<Character,Integer>();
		for(int i=0; i<charInputArray.length; i++) {
			if(!inputMap.containsKey(charInputArray[i])) {
				inputMap.put(charInputArray[i],1);
			}else {
				inputMap.put(charInputArray[i],inputMap.get(charInputArray[i])+1);
			}
		}
		System.out.println(inputMap);
	}

}
