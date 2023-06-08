public class MethodParameter03 {
	public static void main(String[] args) {
		B2 b = new B2();
		Person4 p = new Person4();
		p.name = "jack";
		p.age = 10;
		
		b.test200(p);
		System.out.println("main 的p.age=" + p.age);
	}
}
class Person4 {
	String name;
	int age;
}
class B2 {
	public void test200(Person4 p) {
		p.age = 10000;
	}
}