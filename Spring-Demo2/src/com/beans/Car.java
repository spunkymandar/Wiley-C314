package com.beans;

public class Car {
	private String chasisNo, color, fuelType;
	private long price;
	private double average;
	
	public Car() {
		chasisNo="Eng001";
		color="black";
		fuelType="Diesel";
		price=800000;
		average=12;
	}

	@Override
	public String toString() {
		return "Car [chasisNo=" + chasisNo + ", color=" + color + ", fuelType=" + fuelType + ", price=" + price
				+ ", average=" + average + "]";
	}

	public Car(String chasisNo, String color, String fuelType, long price, double average) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.fuelType = fuelType;
		this.price = price;
		this.average = average;
	}
	
	
	
	

}
