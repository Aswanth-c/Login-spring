package com.security.login.repository;

import com.security.login.userdetails.User;
import com.security.login.userdetails.myuserdetails;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class myuserdetailservice implements UserDetailsService {
@Autowired
Userrepo userrepo;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Optional <User> user = userrepo.findByemail(username);
    log.info(String.valueOf(user));
    user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
    return   user.map(myuserdetails::new).get();
  }
}
