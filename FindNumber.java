package week1.day1;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="Hexaware";
      char expected='e';
      int count=0;
      char[] charArray=name.toCharArray();
      
      for(int i=0;i<charArray.length;i++) {
    	  if(charArray[i] == expected) {
    		  count =count+1;
    	  }
      }
    		  System.out.println("count of"+expected+"in"+name+": "+count);	  
      
	}

}
