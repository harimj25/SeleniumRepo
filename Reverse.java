package week1.day1;

public class Reverse {

	public static void main(String[] args) {
		String S = "TRANSFORMER";
		char [] cArray = S.toCharArray();
		for (int i=cArray.length-1;i>=0; i--) {
			System.out.print(cArray[i]);
		}

	}

}
