public class MethodParameter04 {
	public static void main(String[] args) {
		B3 b = new B3();
		Person5 p = new Person5();
		p.name = "jack";
		p.age = 10;
		
		b.test200(p);
		System.out.println("main 的p.age=" + p.age);
	}
}
class Person5 {
	String name;
	int age;
}
class B3 {
	public void test200(Person5 p) {
		p = new Person5();
		p.name = "tom";
		p.age = 99;
	}
}