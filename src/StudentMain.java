
public class StudentMain {

	public static void main(String[] args) {
		Student studentOne = new Student("Leo Li", 10, 1234567890, 2021);
		System.out.println(studentOne.getName());
		System.out.println(studentOne.getGradeLevel());
		System.out.println(studentOne.getGradYear());
		System.out.println(studentOne.getPhoneNumber());
		System.out.println(studentOne.nextGrade(2021));
		studentOne.setPhoneNumber(111111111);
			
	
	}

}
