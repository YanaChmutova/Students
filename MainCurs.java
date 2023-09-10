import java.util.*;

public class MainCurs {

	public static void main(String[] args) {
		TreeSet<Student> course = new TreeSet<Student>();
		LinkedHashSet<Student> course1 = new LinkedHashSet<Student>();
		Student student1 = new Student("Alice", 2023, "Computer Science", 1201);
        Student student2 = new Student("Bob", 2022, "Mathematics", 1032);
        Student student3 = new Student("Charlie", 2024, "Physics", 1043);
        Student student4 = new Student("David", 2021, "Engineering", 1304);
        Student student5 = new Student("Eve", 2023, "Biology", 1005);
        Student student6 = new Student("Frank", 2022, "Chemistry", 1056);
        Student student7 = new Student("Grace", 2024, "Economics", 1707);
        Student student8 = new Student("Helen", 2021, "Psychology", 9008);
        Student student9 = new Student("Ian", 2023, "Sociology", 1409);
        Student student10 = new Student("Jack", 2022, "History", 1030);
        Student student11 = new Student("Jack", 2022, "History", 1030);
        course.add(student1);
        course.add(student2);
        course.add(student3);
        course.add(student4);
        course.add(student5);
        course.add(student6);
        course.add(student7);
        course.add(student8);
        course.add(student9);
        course.add(student10);
        course1.add(student1);
        course1.add(student2);
        course1.add(student3);
        course1.add(student4);
        course1.add(student5);
        course1.add(student6);
        course1.add(student7);
        course1.add(student8);
        course1.add(student9);
        course1.add(student10);
        course.add(student11);
        course1.add(student11);
        
        Student.printSet(course);
        
        Student.printSet(course1);
	}

	
}
