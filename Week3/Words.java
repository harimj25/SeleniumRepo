package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String companyName="GOOGLE";
 char [] charArray = companyName.toCharArray();
 
 Set<Character> tree=new TreeSet<Character>();
 Set<Character> hash=new HashSet<Character>();
 Set<Character> link=new LinkedHashSet<Character>();
 
 for (int i=0;i < charArray.length; i++) {
	 tree.add(charArray[i]);
	 hash.add(charArray[i]);
	 link.add(charArray[i]);
	 
 }
 System.out.println("Tree: " +tree);
 System.out.println("Hash: " + hash);
 System.out.println("LinkedHash: " +link);
	}

}
