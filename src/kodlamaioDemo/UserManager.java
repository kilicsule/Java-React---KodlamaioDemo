package kodlamaioDemo;

public class UserManager {
	
	public void kayitOl(User user) {
		System.out.println(user.kullaniciAdi + " kullanıcı adı ile kayıt olundu");
	}
	
	/*
	 * public void kayitOlMultiple(User[] users){ for(User user : users) {
	 * kayitOl(user); } }
	 */
	
	public void girisYap(User user) {
		System.out.println(user.kullaniciAdi + " kullanıcı adı ile giriş yapıldı");
	}
 
}
