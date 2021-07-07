package abstraction;

public class Buy {

	public static void main(String[] args) {
		FAmazon u1=new FAmazon();
		u1.login(123654);
		u1.buy("Mobile", 5000);
		u1.logout();
		u1.buy("Mobile", 5000);

	}

}
