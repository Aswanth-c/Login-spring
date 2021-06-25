package com.security.login.userdetails;

import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="logininfo")
public class User  {
	@Id
	public Long id;
	private String email;
	private String password;
	private String Firstname;
	private String roles;
}
