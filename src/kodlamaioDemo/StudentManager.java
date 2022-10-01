package kodlamaioDemo;

public class StudentManager extends UserManager {
	
	@Override
	public void kayitOl(User user) {
		System.out.println(user.kullaniciAdi + " kullanıcı adı ile öğrenci olarak kayıt olundu");
	}
	
	@Override
	public void girisYap(User user) {
		System.out.println(user.kullaniciAdi + " kullanıcı adı ile öğrenci olarak giriş yapıldı");
	}
	
	public void egitimeKatil(Student student, Course course) {
		System.out.println(student.kullaniciAdi + " " + course.courseName + " eğitimine kayıt oldu");
	}
	
}
