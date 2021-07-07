package encapsulation;

public class Vehicle {
	
		String Vname;
		private int vno;
		String Vtype;
		private int cc;
		int mileage;
		private float price;
		String color;
		int no_of_wheels;
		int max_speed;
		public Vehicle(String vname, int vno, String vtype, int cc, int mileage, float price, String color,
				int no_of_wheels, int max_speed) {
			
			Vname = vname;
			this.vno = vno;
			Vtype = vtype;
			if(cc>=100)
			{
				this.cc = cc;
			}else {
				this.cc =100;
			}		
			this.mileage = mileage;
			if(price>0)
			{
				this.price=price;
			}else
			{
				this.price=5000;
			}
						
			this.color = color;
			if(no_of_wheels>=2) 
			{
				this.no_of_wheels = no_of_wheels;
			}else {
				this.no_of_wheels =2;
			}
			if(max_speed>=80) {
				this.max_speed = max_speed;
			}else
			{
				this.max_speed = 90;
			}
			
		}
		public int getVno() {
			return vno;
		}
		public int getCc() {
			return cc;
		}
		
		public void move()
		{
			System.out.println("Your Vehicle "+Vname+" and Vehicle Number is "+this.vno+" And Color is "+this.color);
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		

	}


