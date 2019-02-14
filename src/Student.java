
public class Student {
	private String name;
	private int gradeLevel;
	private int phoneNumber;
	private int gradYear;
	
	public Student(String sName, int grade_Level, int phone_Number, int grad_Year) 
	{
		name = sName;
		gradeLevel = grade_Level;
		phoneNumber = phone_Number;
		gradYear = grad_Year;
	}
	
	public String getName(String studentName) 
	{
		return studentName;		
	}
	public int getGradeLevel(int studentGradeLevel)
	{
		return studentGradeLevel;
	}
	public int getPhoneNumber(int studentPhoneNumber)
	{
		return studentPhoneNumber;
	}
	public int getGradYear(int studentGradYear)
	{
		return studentGradYear;
	}
	public int nextGrade(int studentGradYear)
	{
		return studentGradYear += 1;
	}
	public void setPhoneNumber()
	{
		phoneNumber = 0000000000;
	}

}
