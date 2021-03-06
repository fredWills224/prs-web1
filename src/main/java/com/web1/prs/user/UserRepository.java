package com.web1.prs.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUserNameAndPassword(String userName, String password);

}
