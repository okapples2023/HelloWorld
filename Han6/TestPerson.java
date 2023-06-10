public class TestPerson {
	public static void main(String[] args) {
		Person4 p1 = new Person4("marry", 20);
		Person4 p2 = new Person4("smith", 30);
		
		System.out.println("p1和p2比较的结果=" + p1.compareTo(p2));
	}
}
class Person4 {
	String name;
	int age;
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(Person4 p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
}