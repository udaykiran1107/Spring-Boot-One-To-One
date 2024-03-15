package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
