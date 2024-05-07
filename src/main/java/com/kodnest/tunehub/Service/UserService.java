package com.kodnest.tunehub.Service;

import com.kodnest.tunehub.Entity.User;

public interface UserService {

	public void saveUser(User user);

	boolean emailExists(User user);

	public boolean validUser(String email, String password);

	public String getRole(String email);

	public User getUser(String mail);

	void updateUser(User user);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	List<User>getuser();

}


