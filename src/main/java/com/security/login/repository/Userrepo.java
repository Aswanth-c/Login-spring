package com.security.login.repository;

import com.security.login.userdetails.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository<User, Long> {
Optional<User> findByemail(String Username);
}
