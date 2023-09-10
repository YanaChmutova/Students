import java.util.Set;

public class Student implements Comparable<Student>{
	private String name;
	private int year;
	private String degree;
	private int id;

	public Student(String name, int year, String degree, int id) {
		super();
		this.name = name;
		this.year = year;
		this.degree = degree;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return " name: " + name + " year: " + year + " degree: " + degree + " id: " + id;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Student other) {
		if(this.id==other.id) return 0;
		int res = this.name.compareToIgnoreCase(other.name);
		if(res==0) res = Integer.compare(this.year, other.year);
		if(res==0) res = this.degree.compareToIgnoreCase(other.degree);
		if(res==0) res = Integer.compare(this.id, other.id);
		return res;
	}
	public static void printSet(Set<Student> course) {
		for(Student s: course){
			System.out.println(s);
		}
		System.out.println("------------------");
	}
}
