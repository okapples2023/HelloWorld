public class DoWhileExercise01 {
	public static void main(String[] args) {
		
		int j = 1;
		do {
			System.out.println("你好" + j);
			j++;
		}while(j <= 10);
		
		System.out.println("退出 do..while");
		
		int i = 1;
		int count = 0;
		do {
			if( i % 5 == 0 && i % 3 != 0) {
			   System.out.println("i=" + i);
			   count++;
		    }
			i++;
			
		} while(i <= 200);
		System.out.println("count=" + count);
	}
}