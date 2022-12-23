package week3.day1;

public class Student {
	public void studentInfo(int id)
	{
		System.out.println("Student id: "+ id);
	}
	public void studentInfo(int studentId, String studentName)
	{
		System.out.println("NAme of the student : "+ studentName);
		System.out.println("Id of the student :  "+ studentId);
	}
	public void studentInfo(String email,String phonenumber)
	{
		System.out.println("Email fo the student :  "+ email);
		System.out.println("phonenumber of the student : "+ phonenumber);
	}
	public static void main(String[] args) {
		Student a =new Student();
		a.studentInfo(220943);
		a.studentInfo(262939,"HariPrasad");
		a.studentInfo("harimj@gmail.com","755309540");
		
	}

}
