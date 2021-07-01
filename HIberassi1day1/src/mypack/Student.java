package mypack;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@javax.persistence.Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollno;
	String name,address;
	int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Entity [rollno=" + rollno + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	

}
