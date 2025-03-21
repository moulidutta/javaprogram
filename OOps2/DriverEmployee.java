package OOps2;

public class DriverEmployee {
	public static void main(String[] args) {
		Employee emp1=new Employee("Ari",67890,81234567);
		System.out.println(emp1.name +"\t"+emp1.salary+"\t"+emp1.phn);
		Employee emp2=new Employee("Sri",67560,81278567);
		System.out.println(emp2.name +"\t"+emp2.salary+"\t"+emp2.phn);
	}

}
