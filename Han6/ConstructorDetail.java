public class ConstructorDetail {
	public static void main(String[] args) {
		Person2 p1 = new Person2("king", 40);
		Person2 p2 = new Person2("tom");
		
		Dog dog1 = new Dog();
	}
}
class Dog {
	public Dog(String dName) {
		
	}
	Dog() {
}
}	

class Person2 {
	String name;
	int age;
	
	public Person2(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	public Person2(String pName) {
		name = pName;
		
	}
}