package encapsulation;

public class Showroom {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Delux",5,"Gear",50,50,-22,"Red",1,50);
		System.out.println(v1.Vname);
		System.out.println(v1.getVno());
		System.out.println(v1.Vtype);
		System.out.println(v1.getCc());
		System.out.println(v1.mileage);
		System.out.println(v1.getPrice());
		System.out.println(v1.color);
		System.out.println(v1.no_of_wheels);
		System.out.println(v1.max_speed);
		v1.move();
		v1.setPrice(-1);
		System.out.println(v1.getPrice());
		//Vehicle v2=new Vehicle(null, 0, null, 0, 0, 0, null, 0, 0);
		
		
	}

}
