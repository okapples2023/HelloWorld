public class Object04 {
	public static void main(String[] args) {
		Person2 a = new Person2();
		a.age=10;
		a.name="小明";
		Person2 b;
		b=a;
		System.out.println(b.name);
		b.age=200;
		b = null;
		System.out.println(a.age);
		System.out.println(b.age);
				
	}
}

class Person2 {
	String name;
	int age;
}