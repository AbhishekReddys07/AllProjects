package spring_class1;

public class Bike {
	
	int price;
	String brand;
	Bike(int price,String brand) {
		this.price=price;
		this.brand=brand;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stu
//		System.out.println(price+"\t"+brand);
		return price+"\t"+brand;
	}

}
