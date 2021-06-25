package com.security.login.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApis {


  @GetMapping (path = "/helloworld")
  public  String  m1(){
  return "hello world";
 }
}
