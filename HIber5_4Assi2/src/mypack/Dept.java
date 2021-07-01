package mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dept {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int did;
	String dname;
	String loc;
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
