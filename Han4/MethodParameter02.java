public class MethodParameter02 {
	public static void main(String[] args) {
		B1 b = new B1();
		int[] arr = {1, 2, 3};
		b.test100(arr);
		System.out.println("main的 arr数组");
		for(int i =0;i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
class B1 {
	public void test100(int[] arr) {
		arr[0] = 200;
		System.out.println("test100的 arr数组");
		for(int i =0;i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}