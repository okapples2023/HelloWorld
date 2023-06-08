public class RecursionExercise01 {
	public static void main(String[] args) {
		T2 t1 = new T2();
		int n = 7;
		int res = t1.fibonacci(n);
		if(res != -1) {
		   System.out.println("当n="+ n +" 对应的斐波拉契数=" + res);
	}	
}
}	
class T2 {
	
	public int fibonacci(int n) {
		if( n >= 1) {
		    if( n == 1 || n == 2) {
			    return 1;
		    } else {
			    return fibonacci(n-1) + fibonacci(n-2);
		}
	    } else {
	    	System.out.println("要求输入的n>=1的整数");
	    	return -1;
	    }
}
}	