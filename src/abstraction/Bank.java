package abstraction;

public abstract class Bank {
	public void deposite() {
		System.out.println("Deposite");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
	abstract public void loan();

}
