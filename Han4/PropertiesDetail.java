public class PropertiesDetail {
	public static void main(String[] args) {
	Person0 p1 = new Person0();
	
	System.out.println("\n当前这个人的信息");
	System.out.println("age=" + p1.age + " name=" + p1.name + " sal="
	       + p1.sal + " isPass=" + p1.isPass);
	}
}

class Person0 {
	int age;
	String name;
	double sal;
	boolean isPass;
}