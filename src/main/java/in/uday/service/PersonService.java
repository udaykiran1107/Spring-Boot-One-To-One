package in.uday.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.uday.entity.Passport;
import in.uday.entity.Person;
import in.uday.repo.PassportRepo;
import in.uday.repo.PersonRepo;



@Service
public class PersonService {
	@Autowired
	private PersonRepo prepo;
	@Autowired
	private PassportRepo pprepo;
	
	public void saveperson() {
		Person p =new Person();
		p.setName("uday");
		p.setGender("male");
	
		
		Passport pp=new Passport();
		pp.setPassportnum("edhb3r62r2");
		pp.setIssuedate(LocalDate.now());
		pp.setExpdate(LocalDate.now().plusYears(10));
		
		p.setPassport(pp);
		pp.setPerson(p);
		prepo.save(p);
		
		System.out.println("records are inserted...");
	}
}
