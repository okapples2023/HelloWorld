public class Store1 {
	// instance fields;
	String productType;
	
	// constructor method
	public Store1(String product) {
		productType = product;
	}
	
	// main method
	public static void main(String[] args) {
		Store lemonadeStand = new Store("lemonade");
		System.out.println(lemonadeStand.productType);
	}
}