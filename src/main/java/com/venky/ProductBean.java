package com.venky;

public class ProductBean {
	private int proId;
	private String proName;
	private int proQuantity;
	private double proPrice;
	@Override
	public String toString() {
		return "ProductBean [getProId()=" + getProId() + ", getProName()=" + getProName() + ", getProQuantity()="
				+ getProQuantity() + ", getProPrice()=" + getProPrice() + "]";
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProQuantity() {
		return proQuantity;
	}
	public void setProQuantity(int proQuantity) {
		this.proQuantity = proQuantity;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public ProductBean() {
		super();
	}
	double total=0.0;
	double discount=0.0;
	double invoiceAmount=0.0;
	public void CalculateTotal() {
		 total=proPrice*proQuantity;
		System.out.println(total);
	}
	public void calculateDiscount() {
		if(total<2000) {
			discount=total*10/100;
			invoiceAmount=total-discount;
			System.out.println(discount);
			System.out.println(invoiceAmount);	
		}
		else if(total>2000&&total<=5000) {
			discount=total*20/100;
			invoiceAmount=total-discount;
			System.out.println(discount);
			System.out.println(invoiceAmount);	
		}
		else {
			discount=total*30/100;
			invoiceAmount=total-discount;
			System.out.println(discount);
			System.out.println(invoiceAmount);	
		}
		
		
	}
	
	

}
