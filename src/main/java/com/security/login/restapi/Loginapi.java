package com.security.login.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Loginapi {

  @GetMapping
  public String welcome(){
    return "welcome to home";
  }
}
