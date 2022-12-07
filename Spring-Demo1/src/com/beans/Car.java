package com.beans;

public class Car {
	int chasisno;
	public int getChasisno() {
		return chasisno;
	}
	public void setChasisno(int chasisno) {
		this.chasisno = chasisno;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String make;
	String color;
	public Car() {
		
	}
	public Car(int chasisno, String make, String color) {
		super();
		this.chasisno = chasisno;
		this.make = make;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [chasisno=" + chasisno + ", make=" + make + ", color=" + color + "]";
	}
	
	
	

}
