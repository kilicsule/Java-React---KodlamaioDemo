package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		
		Course course = new Course();
		course.courseName = "Java";

		
		Student student = new Student();
		student.kullaniciAdi = "Şule";
		
		
		Instructor instructor = new Instructor();
		instructor.kullaniciAdi = "Engin";
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.kayitOl(student);
		studentManager.girisYap(student);
		studentManager.egitimeKatil(student , course);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.kayitOl(instructor);
		instructorManager.girisYap(instructor);
		instructorManager.egitimVer(instructor, course);
		
		CourseManager courseManager = new CourseManager();		
		courseManager.add(course);

	}

}
