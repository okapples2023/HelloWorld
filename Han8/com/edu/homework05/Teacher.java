package com.edu.homework05;

public class Teacher extends Employee{
	private int classDays;
	private double classSal;
	
	public Teacher(String name, double sal) {
		super(name, sal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printSal() {
		System.out.print("老师 ");
		System.out.println(getName() + " 年工资是：" + 
	           (getSal()* getSalMonth() + classDays * classSal));
	}
	
	public int getClassDays() {
		return classDays;
	}
	public void setClassDays(int classDays) {
		this.classDays = classDays;
	}
	public double getClassSal() {
		return classSal;
	}
	public void setClassSal(double classSal) {
		this.classSal = classSal;
	}
	
	
	
	

}
