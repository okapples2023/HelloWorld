package com.hspedu.poly_.polyparameter_;

public class Worker extends Employee {

	public Worker(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	public void work() {
		System.out.println("普通员工 " + getName() + " is working");
	}
	
	@Override
	public double getAnnual() {
		// TODO Auto-generated method stub
		return super.getAnnual();
	}

}
