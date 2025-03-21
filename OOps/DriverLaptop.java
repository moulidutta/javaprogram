package OOps;

public class DriverLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		Laptop2 l2 = new Laptop2();
		
		l1.price=78900;
		l1.brand="hp";
		l2.brand="dell";
		l2.price=90000;
		System.out.println(l1.brand);
		System.out.println(l2.brand);
		System.out.println(l1.price);
		System.out.println(l2.price);
		System.out.println("brand:" +"\t"+ l1.brand +"\t"+ l1.price);
		
	}
	


}
