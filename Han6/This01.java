public class This01 {
	public static void main(String[] args) {
		Dog2 dog1 = new Dog2("大壮", 3);
		System.out.println("dog1的hashcode=" + dog1.hashCode());
		dog1.info();
		Dog2 dog2 = new Dog2("大黄", 2);
		System.out.println("dog2的hashcode=" + dog2.hashCode());
		dog2.info();
	}
}
class Dog2 {
	String name; 
	int age;
	public Dog2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("this.hashCode=" + this.hashCode());
	}
	public void info() {
		System.out.println(name + "\t" + age + "\t");
	}
}