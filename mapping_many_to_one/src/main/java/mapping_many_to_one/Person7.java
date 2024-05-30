package mapping_many_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Person7 {
		@Id
		private int num;
		private String name;
		private String address;
		
		@ManyToOne
		Pancard7 p;

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

		public Pancard7 getP() {
			return p;
		}

		public void setP(Pancard7 p) {
			this.p = p;
		}
		
		
}
