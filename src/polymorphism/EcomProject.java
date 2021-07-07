package polymorphism;

public class EcomProject {

	public static void main(String[] args) {
		DEV obj1=new DEV("Ajay", 2, 5000, "Java");
		System.out.println(obj1.Ename);
		System.out.println(obj1.eid);
		System.out.println(obj1.sal);
		System.out.println(obj1.Platform);
		System.out.println(obj1.deptno);
		System.out.println(obj1.desg);
		obj1.work();
		System.out.println();
		TE obj2=new TE("Shyam", 5, 7000, "Ecommers");
		System.out.println(obj2.Ename);
		System.out.println(obj2.eid);
		System.out.println(obj2.sal);
		System.out.println(obj2.Domain);
		System.out.println(obj2.deptno);
		System.out.println(obj2.desg);
		obj2.work();
		System.out.println();
		Emp obj3=new Emp("Mohan", 6, 3000, 5);
		System.out.println(obj3.Ename);
		System.out.println(obj3.eid);
		System.out.println(obj3.sal);
		System.out.println(obj3.deptno);
		System.out.println(obj3.desg);
		obj3.work();

	}

}
