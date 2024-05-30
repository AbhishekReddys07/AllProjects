package project;


import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class JEHA9 {
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  int id ;
@Column(nullable=true,length=50)
private String Name;
@Column(nullable=true)
private byte[] video;
@Column(nullable=true)
private String Address;
@Column(nullable=true,unique=true)
private long Phonenumber;
@CreationTimestamp
 Timestamp Insertiontime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public byte[] getVideo() {
	return video;
}
public void setVideo(byte[] video) {
	this.video = video;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(long phonenumber) {
	Phonenumber = phonenumber;
}
public Timestamp getInsertiontime() {
	return Insertiontime;
}
public void setInsertiontime(Timestamp insertiontime) {
	Insertiontime = insertiontime;
}
public Timestamp getUpdatetime() {
	return updatetime;
}
public void setUpdatetime(Timestamp updatetime) {
	this.updatetime = updatetime;
}
@UpdateTimestamp
 Timestamp updatetime;
}
