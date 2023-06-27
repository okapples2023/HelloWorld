package com.edu.homework05;

public class Homework05 {
	public static void main(String[] args) {
		Worker jack = new Worker("jack", 10000);
		jack.setSalMonth(15);
		jack.printSal();
		
		Peasant smith = new Peasant("smith", 20000);
		smith.printSal();
		
		Teacher teacher = new Teacher("顺平", 2000);
		teacher.setClassDays(360);
		teacher.setClassSal(1000);
		teacher.printSal();
		
		Scientist scientist = new Scientist("钟南山", 20000);
		scientist.setBonus(200000);
		scientist.printSal();
	}

}
