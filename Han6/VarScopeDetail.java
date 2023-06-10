public class VarScopeDetail {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.say();
		
		T1 t1 = new T1();
		t1.test();
		
		t1.test2(p1);
	}
}
class T1 {
	public void test() {
		Person p1 = new Person();
		System.out.println(p1.name);
	}
	
	public void test2(Person p) {
		System.out.println(p.name);
	}
}

class Person {
	public int age = 20;
	
	String name = "jack";
	
	public void say() {
		String name = "king";
		System.out.println("say() name " + name);
	}
	public void hi() {
		String address = "北京";
		String name ="hsp";
	}
}