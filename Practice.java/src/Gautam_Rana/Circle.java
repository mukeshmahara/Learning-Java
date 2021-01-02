package Gautam_Rana;

public class Circle {
	private double radius;
	

//	Question c method
	public boolean greaterThan(Circle c1,Circle c2) {
//		c = new Circle(10);
//
//		c3 = new Circle(6);

		if((c1.getArea())> (c2.getArea())) {
			
			return true;
		}
		return false;
	}
	
	public Circle(double r) {
		// TODO Auto-generated constructor stub

		radius = r;

	}


	
//	Question b method
	public boolean equal(Circle c1,Circle c2) {
//		
		if (c1.equals(c2)) {
			
			return true;
		} 
		else {
			return false;
		}
	}

//	Question a method
	public String toString() {
		return "The radius of circe is "+getRadius()+" and area is " +getArea();
	}
	
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(20);
		
		Circle c2 = new Circle(10);
		
//		c1=c2;
		
//		System.out.println(c1.hashCode());
//		
//		System.out.println(c2.hashCode());
	
	
		System.out.println("a) Here, "+c1.toString());
		
		System.out.println("b) Test : "+(c1.equal(c1,c2)));
		
		System.out.println("c) Result : "+c1.greaterThan(c1,c2));
	}

}
