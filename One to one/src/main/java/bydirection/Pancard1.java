package bydirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Pancard1 {
@Id
private int pan_num;
private String name;
private String address;

public int getPan_num() {
	return pan_num;
}

public void setPan_num(int pan_num) {
	this.pan_num = pan_num;
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

public Pancard1 getP() {
	return p;
}

public void setP(Pancard1 p) {
	this.p = p;
}

@OneToOne
Pancard1 p;


	
}
