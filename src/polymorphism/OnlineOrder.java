package polymorphism;

public class OnlineOrder {

	public static void main(String[] args) {
		Ecommerce a1=new Ecommerce();
		a1.online();
		Amazon a2=new Amazon();
		a2.online();
		Flipkart a3=new Flipkart();
		a3.online();

	}

}
