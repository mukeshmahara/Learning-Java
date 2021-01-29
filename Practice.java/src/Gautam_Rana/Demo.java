package Gautam_Rana;

class Vechile{
	
	String brand;
	String color;
	
	public Vechile(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String hank() {
		return "I hanked";
	}
}

class Car extends Vechile{
	
	
	public Car(String brand, String color, String modelname) {
		super(brand, color);
		this.modelname = modelname;
		
		System.out.println("Car instance created...");
	}

	String modelname;
	
	
	public String getModelname() {
		return modelname;
	}


	public void setModelname(String modelname) {
		this.modelname = modelname;
	}


	public String drive() {
		return "i can drive";
	}
	
}

public class Demo {
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Car car = new Car("farari","red","hero");
		
	}
}

