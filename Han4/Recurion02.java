public class Recurion02 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.test(4);
		
	}
}
class T1 {
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		} else {
			System.out.println("n=" + n);
		}
	}
}