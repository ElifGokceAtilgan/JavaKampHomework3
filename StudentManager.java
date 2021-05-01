package homework3;

public class StudentManager extends UserManager {
	
	public void addNewLesson() {
		System.out.println( "Student attended java education.");
	}
	
	public void homeworkInfo(Student student) {
		System.out.println(student.getName() + " completed the assignment successfully.");
	}
	

}
