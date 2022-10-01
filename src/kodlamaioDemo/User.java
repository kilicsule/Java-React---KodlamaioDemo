package kodlamaioDemo;

public class User {

	int id;
	String kullaniciAdi;
	String email;
	Course courseName;
	
	public User() {
		
	}
	
	public User(int id, String kullaniciAdi, String email) {
		this.id = id;
		this.kullaniciAdi = kullaniciAdi;
		this.email = email;
	}
	
}
