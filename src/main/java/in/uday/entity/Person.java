package in.uday.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="person_tbl")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer pid;
	private String name;
	private String gender;
	
	
	@OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	private Passport passport;


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	
	

}
