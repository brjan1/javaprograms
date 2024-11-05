package java011_l_al_sorting_implementing_comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {
	
	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		System.out.println(students);
		
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		
	}

}
