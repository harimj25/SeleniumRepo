package week1.day1;

public class Words {

	public static void main(String[] args) {
	String name = "Amazon development center,chennai";
	String name1=name.toLowerCase();
	String[] reversewords =name1.split(" ");
	
	System.out.println(reversewords.length);
	for (int i = reversewords.length-1;i>=0; i--) {
		System.out.print(reversewords[i]+ " ");
	}

	}

}
