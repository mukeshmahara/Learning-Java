package Gautam_Rana;

import java.util.Scanner;

public class Land_Tract {
	
	
	private float length;

	private float width;

	private float area;

	public Land_Tract(float length, float width) {
		// TODO Auto-generated constructor stub
		this.length=length;
		this.width = width;
	}
	
	public boolean equal(Land_Tract lt1,Land_Tract lt2) {
		if(lt1.getTract_Area()!=lt2.getTract_Area()) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
	public String toString() {
		return ""+getTract_Area();
	}

	public float getTract_Area() {
		// TODO Auto-generated method stub
		area = length*width;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of the Land Tract 1 :");
		float length1 = s.nextFloat();
		System.out.println("Enter the width of the land Tract 1 :");
		float width1 = s.nextFloat();
		
		Land_Tract lt1 = new Land_Tract(length1,width1);
		
		
		System.out.println("Enter the Length of the Land Tract 2 :");
		float length2 = s.nextFloat();
		System.out.println("Enter the width of the land Tract 2 :");
		float width2 = s.nextFloat();
		Land_Tract lt2 = new Land_Tract(length2,width2);
		
		System.out.println("Here, Area of land tract 1 is " +lt1.toString());

		System.out.println("Here, Area of land tract 2 is " +lt2.toString());
		
		
		System.out.println("Land Tract Size : "+lt1.equal(lt1,lt2));
	}

}
