package com.security.login.restapi;

import com.security.login.repository.Userrepo;
import com.security.login.restapi.useralreadypresent;
import com.security.login.userdetails.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Signupapi {

  @Autowired
  private Userrepo userrepo;
  @Autowired
  PasswordEncoder passwordEncoder;


  @PostMapping("/api/auth/signup")
  public String signup(@RequestBody User user) throws useralreadypresent {
    System.out.println(user.getEmail());
    Optional <User> usercheck= userrepo.findByemail(user.getEmail());
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    if(usercheck.isPresent()){
      throw new useralreadypresent("useralreadyexisits");
    }
    long i=2;
user.setId(i);
    userrepo.save(user);
    return "success";
  }
  @Bean
  public PasswordEncoder getEncoder() {
    return new BCryptPasswordEncoder();
  }
}
