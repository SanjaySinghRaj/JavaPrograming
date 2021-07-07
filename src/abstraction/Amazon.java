package abstraction;

public abstract class Amazon {
	long phno;

	public void login(long phno) {
		
		this.phno = phno;
		System.out.println("Login Succesfull");
	}
	public void logout() {
		System.out.println("Logout");
		phno=0l;
	}
	public void buy(String pname,float amt) {
		if(phno>0) {
			System.out.println("Plese do a Payment for Product "+pname );
			payment(amt);
		}
		else {
			System.out.println("Login First");
		}
	}
	 abstract public void payment(float amt);
	

}
