package com.security.login.Jwtlogin;

import com.security.login.repository.Userrepo;
import com.security.login.restapi.RestApis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
@EnableAutoConfiguration
@ComponentScan({"com.security.login"})
@EntityScan(basePackages = "com.security.login")
@EnableJpaRepositories(basePackages = "com.security.login")
@ComponentScan (basePackageClasses = RestApis.class)
public class JwtloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtloginApplication.class, args);
	}

}
//com.security.login.repository.Userrepo
