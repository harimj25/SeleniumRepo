package week3.day1;

public class Desktop extends Computer {
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel("DELL");
		d.desktopSize("22 inch");
	}
	public String desktopSize(String size)
	{
		System.out.println("Desktop size is :  "+ size);
		return null;

	}
}
