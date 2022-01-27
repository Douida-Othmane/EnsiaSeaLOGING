package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//Repo li fiha les fonctions prédéfinies (saveAll, saveId..)

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);

}
