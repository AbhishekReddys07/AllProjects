package spring_class1;

public class Car {
	
	String brand;
	int num;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "car brand->  "+brand+"\t"+"price--> m "+num;
	}
	

}
