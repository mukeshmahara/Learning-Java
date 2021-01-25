package Gautam_Rana;

import java.util.Scanner;

public class Rectangle {

	private double width;
	private double length;
	
	public void setWidth(double w) {
		this.width=w;
		
	}
	
	public void setLength(double len) {
		this.length=len;
	}
	
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getArea() {
		return getLength()*getWidth();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		Scanner s = new Scanner(System.in);
		System.out.println("Set length of Rectangle:");
		double length = s.nextDouble();
		r.setLength(length);
		
		System.out.println("Set width of Rectangle :");
		double width = s.nextDouble();
		r.setWidth(width);
		System.out.println("Area of Rectangle is :"+r.getArea());


	}

}
