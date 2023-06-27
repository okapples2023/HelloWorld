package com.hspedu.object_;

public class Finalize_ {
	public static void main(String[] args) {
		Car bmw = new Car("宝马");
		bmw = null;
		System.gc();
		
		System.out.println("程序退出了...");
	}

}
class Car{
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("我们销毁了汽车" + name );
	}
}
