package com.hspedu.extend.exercise;

public class ExtendsExercise02 {
	public static void main(String[] args) {
		
		C c = new C();
	}
}
class A1 {
	public A1() {
		System.out.println("我是A类");
	}
}
class B1 extends A1 {
	public B1() {
		System.out.println("我是B类的无参构造");
	}
	public B1(String name) {
		System.out.println(name + "我是B类的有参构造");
	}
}
class C extends B1 {
	public C() {
		this("hello");
		System.out.println("我是C类的无参构造");
	}
	public C(String name) {
		super("hahah");
		System.out.println("我是C类的有参构造");
	}
}