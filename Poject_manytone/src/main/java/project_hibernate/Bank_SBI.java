package project_hibernate;

import javax.persistence.Id;
import javax.persistence.OneToOne;



public class Bank_SBI {
	@Id
	int acc_no;
	int Pan_num;
	String name;
	String address;
	
	@OneToOne
	User1 u;

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getPan_num() {
		return Pan_num;
	}

	public void setPan_num(int pan_num) {
		Pan_num = pan_num;
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

	public User1 getU() {
		return u;
	}

	public void setU(User1 u) {
		this.u = u;
	}
	

}
