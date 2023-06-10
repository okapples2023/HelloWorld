public class ConstructorExercise {
	public static void main(String[] args) {
		Person3 p1 = new Person3();
		System.out.println("构造器的name=" + p1.name +" age=" + p1.age);
		Person3 p2 = new Person3("scott", 50);
		System.out.println("构造器的name=" + p2.name +" age=" + p2.age);
		
	}
}
class Person3 {
	String name;
	int age;
	
	public Person3() {
		age = 18;
	}
	public Person3(String pName,int pAge) {
		name = pName;
		age = pAge;
	}
}