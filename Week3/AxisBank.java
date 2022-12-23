package week3.day1;

public class AxisBank extends BankInfo {
	 public int deposit()
	    {
	    	return 550000;
	    }
	    public static void main(String[] args) {
			AxisBank a=new AxisBank();
			System.out.println(a.deposit());

}
}
