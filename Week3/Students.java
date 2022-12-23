package week3.day1;

public class Students extends Department{
	public String studentName(String name)
	{
		return name;
	}
	public String studentDept(String studentDept)
	{
		return studentDept;
	}
	public int studentId(int studentId)
	{
		return studentId;

	}

	public static void main(String[] args) {
		Students s= new Students();
		System.out.println("Name of the student is:  "+ s.studentName("HariPrasad")); 
		System.out.println("Stiudent department is: " + s.studentDept("Bachelor of Computer Appilication"));
		System.out.println("Student Id is: " + s.studentId(2109282));
		System.out.println("Student department name is: "+ s.deptName("BCA"));
		System.out.println("College Name is: "+ s.collegeName("Vistas"));
		System.out.println("College code is : "+ s.collegeCode("3954021"));
		System.out.println("College rank code is:  "+ s.collegeRank("26293949"));

	}
}
