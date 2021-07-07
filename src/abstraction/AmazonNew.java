package abstraction;

public class AmazonNew implements AmazonNewS1,AmazonNewS2,AmazonNewS3{

	@Override
	public void login() {
		System.out.println("Login Done");
		
	}

	@Override
	public void logout() {
		
		System.out.println("Tata Bye Bye");
	}

	@Override
	public void cart() {
		
		System.out.println("Product Add");
	}

	
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Product Buy Succesfully");
		
	}

	@Override
	public void filter() {
		// TODO Auto-generated method stub
		System.out.println("product Filter As your need");
		
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("product sort As your need");
	}
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment Done");
	}

	@Override
	public void Return() {
		// TODO Auto-generated method stub
		System.out.println("Product Return If is Damage");
	}


}
