package getting_inputs;

import java.util.Scanner;

public class StudentInputs {
	public static void main(String[] args) {
		Integer studentId;
		String studentName;
		Integer age;
		String schoolName;
		float cgpa;
		char grade;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input Student id:");
		studentId = s.nextInt();
		System.out.println("Input your name:");
		studentName = s.next();
		System.out.println("Input your age:");
		age = s.nextInt();
		System.out.println("Input your CGPA:");
		cgpa = s.nextFloat();
		System.out.println("Input your grade:");
		grade = s.next().charAt(0);
		
		System.out.println("Your id: "+studentId);
		System.out.println("Your Name: "+studentName);
		System.out.println("Your Age: "+age);
		System.out.println("Your CGPA: "+cgpa);
		System.out.println("Your grade: "+grade);
	}
}

