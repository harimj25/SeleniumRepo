package week1.day1;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="hi hello welcome  to  everybody";
		String inputarray1[]=input1.split(" ");
		
		String input2="Avenger   to  Assemble"; 
		String inputarray2[]=input2.split(" ");
		
		String input3="Love the life you live";
		String inputarray3[]=input3.split(" ");
		
		for (int j=inputarray1.length-1;j>=inputarray1.length-1;j--)
		{
		     char a1[]=inputarray1[j].toCharArray();
		     System.out.println("String1:" + a1.length);
		}
		for (int j=inputarray2.length-1;j>=inputarray2.length-1;j--)
		{
		     char a2[]=inputarray2[j].toCharArray();
		     System.out.println("String2:" + a2.length);
		} 
		for (int j=inputarray3.length-1;j>=inputarray3.length-1;j--)
		{
		     char a3[]=inputarray3[j].toCharArray();
		     System.out.println("String3:" + a3.length);
		}
		
	}
	}

	


