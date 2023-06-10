public class Constructor01 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("smith", 80);
		System.out.println("p1的信息如下");
		System.out.println("p1对象name= " + p1.name);
		System.out.println("p1对象age= " + p1.age);
	}
}
class Person1 {
	String name;
	int age;
	
	public Person1(String pName, int pAge) {
		System.out.println("构造器被调用~~");
		name = pName;
		age = pAge;
	}
}