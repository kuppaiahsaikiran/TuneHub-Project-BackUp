package com.kodnest.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.tunehub.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	

}
