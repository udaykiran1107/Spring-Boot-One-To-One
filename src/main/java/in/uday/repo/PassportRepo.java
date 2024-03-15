package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
