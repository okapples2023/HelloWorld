package com.hspedu.extend.improve_;

public class Sub extends Base{
	public Sub() {
		super();
		System.out.println("子类Sub()构造器被调用...");
	}
	public Sub(String name) {
		super();
		System.out.println("子类Sub(String name)构造器被调用...");
	}
	public void sayOk() {
		System.out.println(n1 + " " + n2 + " " + n3);
		test100();
		test200();
		test300();
		
		System.out.println("n4=" + getN4());
		callTest400();
	}

}
