package com.zee.zee5app.service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
// service objects are used to just call the service inside the main method.
// to fix multiple copies issues, they've provided with a solution called singleton design pattern.
// singleton ==> one ==> to get only one object for the specific type.

public class UserService 
{
	private UserRepository repository = UserRepository.getInstance();
	// Service is consuming repository
	
	private UserService()
	{
		
	}
	// if we want to create that single object then we have to create it
	// inside the same class and we have to share the reference with others.
	// to do the same we have to declare a method.
	
	private static UserService service = null;
	// this would be a local ref.
	// only one copy
	
	public static UserService getInstance()
	{
		// object independent 
		// static will make it independent on the object for execution.
		
		if(service == null)
		service = new UserService();
		return service;
	}
	
	public String addUser(Register register)
	{
		// do we need to consume the addUser method from repo.
		return this.repository.addUser(register);
	}
	
	
	public Register getUserById(String id)
	{
		return this.repository.getUserById(id);
	}
	
	public Register[] getUsers()
	{
		return repository.getUsers();
	}
}
