package Gautam_Rana;

import java.util.Scanner;import sun.tools.tree.ThisExpression;

//1. Use of interface implementation in classes
//- Create a RetailItem interface, which has only one method i.e. public double getRetailPrice();
//- Create a class CompactDisc, which implements RetailItem interface.
//It has three fields, CD's title, CD's artist, and retail price. 
//- Write a constructor for this class which initializes all the fields for this class i.e. CompactDisc
//- Write the accessors for its fields.
//- Write the definition of method getRetailPrice(), whose header was in the definition of interface RetailItem face.

public class CompactDisc implements RetailItem {
	String	cds_title,
			cds_artist;
	double retail_price;

	public CompactDisc(String title,String Artist, double price) {
		// TODO Auto-generated constructor stub
		this.cds_title = title;
		this.cds_artist = Artist;
		this.retail_price = price;
		System.out.println("helll9"+this);
	}
	
	
	public double getRetailPrice() {
		
		return retail_price;
		
	}
	


	public String getCds_title() {
		return cds_title;
	}




	public void setCds_title(String cds_title) {
		this.cds_title = cds_title;
	}




	public String getCds_artist() {
		return cds_artist;
	}




	public void setCds_artist(String cds_artist) {
		this.cds_artist = cds_artist;
	}




	public double getRetail_price() {
		return retail_price;
	}




	public void setRetail_price(double retail_price) {
		this.retail_price = retail_price;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the title of CD:");
		String title = s.next();
		System.out.println("Enter the name of CD Artist :");
		String artist = s.next();
		System.out.println("Enter the Retailprice of CD :");
		double price = s.nextDouble();
		
		
		CompactDisc compactDisc = new CompactDisc(title,artist,price);
		String nameString= "Mukesh";
		System.out.println("Retail Price = "+compactDisc.getRetailPrice());
		System.out.println("Print This");
		
		
	}

}
