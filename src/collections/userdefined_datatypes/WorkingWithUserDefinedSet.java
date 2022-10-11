package collections.userdefined_datatypes;

import java.util.LinkedHashSet;
import java.util.Set;

public class WorkingWithUserDefinedSet {
	public static void main(String[] args) {
		Student anant = new Student(102, "Anant", "Noida");		
		Student bharathy = new Student(110, "Bharathy", "Chennai");
		Student amuthesh = new Student(112, "Amutheshwaran", "Hyderabad");		
		Student subhalaxmi = new Student(109, "Subhalaxmi", "Pune");
		Student pallavi = new Student(122, "Pallavi", "Maharashtra");		
		Student raja = new Student(117, "Raja Rajendran", "Goa");
		Student raja2 = new Student(117, "Raja Rajendran", "Goa");
		System.out.println(raja.hashCode());
		System.out.println(raja2.hashCode());
		
		if(raja.equals(raja2)) {
			System.out.println("Both the objects are equal");
		}
		else {
			System.out.println("The objects are not equal");
		}
		
		Set<Student> studentSet = new LinkedHashSet<>();
		
		studentSet.add(anant);
		studentSet.add(bharathy);
		studentSet.add(amuthesh);
		studentSet.add(subhalaxmi);
		studentSet.add(pallavi);
		studentSet.add(raja);
		studentSet.add(raja2);
//		for(Student student: studentSet) {
//			System.out.println(student+": hashCode: "+student.hashCode());
//		}
		
//		Set<String> stringsSet = new LinkedHashSet<>();
//		stringsSet.add("Vignesh");
//		stringsSet.add("Dinesh");
//		stringsSet.add("Vignesh");
//		stringsSet.add("Dinesh");
//		
//		for(String names: stringsSet) {
//			System.out.println(names.hashCode());
//		}
		
//		String name1 = new String("Vignesh");
//		String name2 = new String("Vignesh");
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
	}
}


