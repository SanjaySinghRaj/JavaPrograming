package abstraction;

public class ApplyLoan {

	public static void main(String[] args) {
		CityBank u1=new CityBank();
		u1.deposite();
		u1.withdraw();
		u1.loan();
		ICICI u2=new ICICI();
		u2.deposite();
		u2.withdraw();
		u2.loan();
		SBI u3=new SBI();
		u3.deposite();
		u3.withdraw();
		u3.loan();

	}

}
