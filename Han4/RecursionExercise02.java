public class RecursionExercise02 {
	public static void main(String[] args) {
		T3 t1 = new T3();
		int day = 1;
		int peachNum = t1.peach(day);
	    if(peachNum != -1) {
	    	System.out.println("第" + day + "天有" + peachNum + "个桃子");
	    }
	}
}
class T3 {
	public int peach(int day) {
		if(day == 10) {
			return 1;
		} else if ( day >= 1 && day <=9 ) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day在1-10");
			return -1;
		}
		
	}
	
}