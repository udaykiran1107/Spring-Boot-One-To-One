package in.uday.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="passport_tbl")
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportid;
	private String passportnum;
	private LocalDate issuedate;
	private LocalDate expdate;
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;
	
	public Integer getPassportid() {
		return passportid;
	}
	public void setPassportid(Integer passportid) {
		this.passportid = passportid;
	}
	public String getPassportnum() {
		return passportnum;
	}
	public void setPassportnum(String passportnum) {
		this.passportnum = passportnum;
	}
	public LocalDate getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}
	public LocalDate getExpdate() {
		return expdate;
	}
	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
