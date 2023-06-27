package com.edu.homework;

public class Homework04 {
	public static void main(String[] args) {
		Manager manager = new Manager("刘备", 100, 20, 1.2);
		manager.setBonus(3000);
		manager.printSal();
		
		double grade = 1.0;
		Worker worker = new Worker("关羽", 50, 10, grade);
		worker.printSal();
		
	}

}
