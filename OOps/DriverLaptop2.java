package OOps;

public class DriverLaptop2 {
	public static void main(String[] args) {
		Laptop3 l1=new Laptop3("dell",67890,8);
		System.out.println(l1.brand +"\t"+l1.price+"\t"+l1.ram);
		Laptop3 l2=new Laptop3("hp",67850,8);
		System.out.println(l2.brand +"\t"+l2.price+"\t"+l2.ram);
	}

}
