package unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan_card {
@Id
private int id;
private String name;
private String address;
private long ph_no;

@OneToOne
Person per;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public long getPh_no() {
	return ph_no;
}

public void setPh_no(long ph_no) {
	this.ph_no = ph_no;
}

public Person getPer() {
	return per;
}

public void setPer(Person per) {
	this.per = per;
}

}