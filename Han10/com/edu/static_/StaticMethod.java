package com.edu.static_;

public class StaticMethod {
	public static void main(String[] args) {
		
		Stu tom = new Stu("Tom");
		tom.payFee(100);
		
		Stu mary = new Stu("mary");
		mary.payFee(200);
		
		Stu.showFee();
		
		System.out.println("9开平方的结果是=" + Math.sqrt(9));
		
		System.out.println(MyTools.calSum(10, 30));
		
	}

}
class MyTools {
	public static double calSum(double n1, double n2) {
		return n1 + n2;
	}
}


class Stu {
	private String name;
	
	private static double fee = 0;

	public Stu(String name) {
		super();
		this.name = name;
	}
	public static void payFee(double fee) {
		Stu.fee += fee;
	}
	public static void showFee() {
		System.out.println("总学费有:" + Stu.fee);
	}
	
	
}
