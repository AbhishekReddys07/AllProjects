package mapping_many_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard7 {

	@Id
	private int num;
	private String name;
	private String address;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
