package inheritance;

public class Driver {

	public static void main(String[] args) {
		Parent obj1 = new Parent(10, 20);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		Child obj2 = new Child(100, 200, 300);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);

	}

}
