package dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity(name = "JEHA9")
public class Demo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Lob @Column(nullable = false)
	byte[] video;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false, unique = true, length = 10)
	long number;
	@CreationTimestamp
	Timestamp insertion_date_time;
	@UpdateTimestamp
	Timestamp updatation_date_time;

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

	public byte[] getVideo() {
		return video;
	}

	public void setVideo(byte[] video) {
		this.video = video;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Timestamp getInsertion_date_time() {
		return insertion_date_time;
	}

	public void setInsertion_date_time(Timestamp insertion_date_time) {
		this.insertion_date_time = insertion_date_time;
	}

	public Timestamp getUpdatation_date_time() {
		return updatation_date_time;
	}

	public void setUpdatation_date_time(Timestamp updatation_date_time) {
		this.updatation_date_time = updatation_date_time;
	}

}
