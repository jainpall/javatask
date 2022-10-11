package collections.userdefined_datatypes;

import java.util.LinkedList;
import java.util.List;

public class WorkingWithUserDefinedList {

	public static void main(String[] args) {
		Student anant = new Student(102, "Anant", "Noida");		
		Student bharathy = new Student(110, "Bharathy", "Chennai");
		Student amuthesh = new Student(112, "Amutheshwaran", "Hyderabad");		
		Student subhalaxmi = new Student(109, "Subhalaxmi", "Pune");
		Student pallavi = new Student(122, "Pallavi", "Maharashtra");		
		Student raja = new Student(117, "Raja Rajendran", "Goa");
		Student raja2 = new Student(117, "Raja Rajendran", "Goa");

		List<Student> studentList = new LinkedList<>();
		
		studentList.add(anant);
		studentList.add(bharathy);
		studentList.add(amuthesh);
		studentList.add(subhalaxmi);
		studentList.add(pallavi);
		studentList.add(raja);
		studentList.add(raja2);

		for(Student student: studentList) {
			System.out.println(student);
		}

	}
}

