package conm.jac.servletdemo.mnvtwo;

import java.util.*;

public class StudentDataUtil {
	
	// create getter
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Mary", "Public", "mary@johnabbottcollege.qc.ca"));
		students.add(new Student("Ajay", "Doe", "ajay@johnabbottcollege.qc.ca"));
		students.add(new Student("Daniel", "Quinneville", "daniel@johnabbottcollege.qc.ca"));
		
		return students;
	}
}
