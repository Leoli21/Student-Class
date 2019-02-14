
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
	public String getName() 
	{
		return name;		
	}
	public int getGradeLevel()
	{
		return gradeLevel;
	}
	public int getPhoneNumber()
	{
		return phoneNumber;
	}
	public int getGradYear()
	{
		return gradYear;
	}
	public int nextGrade(int studentGradYear)
	{
		return studentGradYear += 1;
	}
	public void setPhoneNumber(int newPhoneNumber)
	{
		phoneNumber = newPhoneNumber;
	}

}
