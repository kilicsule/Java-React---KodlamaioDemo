package kodlamaioDemo;

public class InstructorManager extends UserManager {
	
	@Override
	public void kayitOl(User user) {
		System.out.println(user.kullaniciAdi + " kullanıcı adı ile eğitmen olarak kayıt olundu");
	}
	
	@Override
	public void girisYap(User user) {
		System.out.println(user.kullaniciAdi + " kullanıcı adı ile eğitmen olarak giriş yapıldı");
	}
		
	public void egitimVer(Instructor instructor, Course course) {
		System.out.println(instructor.kullaniciAdi + " " + course.courseName + " eğitimini verdi");
	}
}
