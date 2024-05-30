package bydirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
private int num;
private String name;
private String address;
@OneToOne
Pancard1 card;
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
public Pancard1 getCard() {
	return card;
}
public void setCard(Pancard1 card) {
	this.card = card;
}

	
}
