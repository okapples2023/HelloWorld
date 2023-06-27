package com.edu.homework05;

public class Peasant extends Employee{

	public Peasant(String name, double sal) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printSal() {
		System.out.print("农民 ");
		super.printSal();
	}

}
