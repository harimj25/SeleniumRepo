package week1.day1;

public class Palindrome1 {
	public boolean isPalindrome(String input) {
		boolean flag = true;
		if(input == " ") {
			return flag;
		}else{
			input = input.replaceAll("[^a-zA-z]", "");
			char[] inputArray = input.toCharArray();
			String inputReverse="";
			for(int i=inputArray.length-1; i>=0;i--) {
				inputReverse += inputArray[i];
			}
			if (input.equalsIgnoreCase(inputReverse)){
				flag = true;
			}else flag = false;
			}
		return flag;}

		public static void main(String[] args){
		
				String input1 = "A man, a plan, a canal: Panama";
				Palindrome1 pal = new Palindrome1();
				if (pal.isPalindrome(input1)) {
					System.out.println("String \'" + input1 + "\' palindrome!");
				}else {
					System.out.println("String \'" + input1 + "\' No palindrome!");
				}

			}

		
	}


