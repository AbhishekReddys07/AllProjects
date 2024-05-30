package project_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class User1 {
	@Id
	int Pan_num;
	String name;
	String address;
	
	@OneToOne
	Bank_SBI bank_SBI;

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

	public Bank_SBI getBank_SBI() {
		return bank_SBI;
	}

	public void setBank_SBI(Bank_SBI bank_SBI) {
		this.bank_SBI = bank_SBI;
	}

}
