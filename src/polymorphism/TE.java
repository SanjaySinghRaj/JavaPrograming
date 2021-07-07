package polymorphism;

public class TE extends Emp{

	String Domain;
	public TE(String ename, int eid, float sal,String Domain) {
		super(ename, eid, sal, 1);
		this.Domain=Domain;
		
	}
	public void work() {
		System.out.println("TE is busy in testing an Application");
		System.out.println("He will muder the Application then only he will stop");
	}

}
