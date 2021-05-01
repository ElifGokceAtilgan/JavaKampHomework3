package homework3;

public class Main {

	public static void main(String[] args) {
		Student student= new Student();
			student.setName("Elif Gökçe Atılgan");
			student.setId(9);
			student.setUserName("EGA");
			student.setPassword("1234");
			student.setEmail("elifgokceatilgan@example.com");
		    student.setDepartment("Computer Engineering");
		    
		    student.getName();
		    student.getUserName();
		    
		    
		    Instructor instructor = new Instructor();
		     instructor.setName("Engin Demiroğ");
             instructor.setId(1);
             instructor.setUserName("ED");
             instructor.setPassword("1111");
             instructor.setEmail("engindemirog@example.com");
             instructor.setStatus("professor");
             
             instructor.getStatus();
             instructor.getName();
             
             
            StudentManager studentManager = new StudentManager();
            studentManager.add(student);
            studentManager.addNewLesson();
            studentManager.homeworkInfo(student);
            studentManager.update();
            
            InstructorManager instructorManager= new InstructorManager();
           
            instructorManager.addHomework();
            instructorManager.update();
            
            UserManager userManager= new UserManager();
            userManager.add(student);
            
	}

}
