package polymorphism;

public class Emp {
	String Ename;
	int eid;
	float sal;
	int deptno;
	String desg;
	public void work() {
		System.out.println("working");
	}
	public Emp(String ename, int eid, float sal, int deptno) {
		
		Ename = ename;
		this.eid = eid;
		this.sal = sal;
		this.deptno = deptno;
		switch (deptno) {
		case 1: this.desg="TE";
		break;
		case 2 :this.desg="DEV";
		break;
		default:this.desg="NTF";
			
		}
	}
	
	

}
