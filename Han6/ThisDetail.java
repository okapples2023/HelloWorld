public class ThisDetail {
	public static void main(String[] args) {
		TT t1 = new TT();
		t1.f2();
		TT t2 = new TT();
		t2.f3();
	}	
}
class TT {
	String name = "jack";
	int num = 100;
	
	public TT() {
		this("jack", 100);
		System.out.println("T() 构造器");
	}
	
	public TT(String name, int age) {
		System.out.println("T(String name, int age) 构造器");
	}
	public void f3() {
		String name = "smith";
		System.out.println("name=" + name + " num=" + num);
		System.out.println("name=" + this.name + " num=" + this.num);
	}
	public void f1() {
		System.out.println("f1() 方法..");
	}
	public void f2() {
		System.out.println("f2() 方法..");
		f1();
		this.f1();
	}
}