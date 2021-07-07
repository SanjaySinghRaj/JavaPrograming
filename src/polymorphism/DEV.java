package polymorphism;

public class DEV extends Emp {
	
	String Platform;
	public DEV(String ename, int eid, float sal,String Platform ) {
		super(ename, eid, sal, 2);
		this.Platform=Platform;
	}
	public void work() {
		System.out.println("DEV is busy in Developing an Application");
		System.out.println("He will develop in such a way that TE will sucide bcs of 0 bugs");
	}

	

}
