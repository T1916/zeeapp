package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Register;
// repo objects are used to call only repo methods
import com.zee.zee5app.service.UserService;


public class UserRepository 
{
	private Register[] registers = new Register[10];
	private static int count = -1;
	private UserRepository()
	{
	
	}
	
	// to return all the user details
	public Register[] getUsers()
	{
		return registers;
	}
	
	// delete user is an assignment
	// have occupancy till 20; delete user on 5th index
	// 5th index should be removed and data from 6th index should be shifted back
	public String delteUser(String id)
	{
		return null;
	}
	// update user is an assignment
	public String updateUser(String id, Register register)
	{
		return null;
	}
	
	// this method should return the user details based on the ID
	public Register getUserById(String id)
	{
		// do we need to traverse the array? Yes
		
		for (Register register : registers) 
		{
			if(register.getId().equals(id))
			{
				return register;
			}
		}
		
		return null;
		
	}
	
	// add a new user
	public String addUser(Register register) 
	{
		// registers.length ==> it will give us the availability
		
		if(count == registers.length - 1)
		{
			// array is full or we should go for dynamically growing the 
			// size of array.
			Register temp[] = new Register[registers.length*2];
			
			// do we need to copy the contents from old to new? Yes
			
			System.arraycopy(registers, 0, temp, 0, registers.length);
			registers = temp;
			registers[++count] = register;
			
			return "success";
		}
		
		registers[++count] = register;
		return "success";
			
		
	}
	
	private static UserRepository userRepository = null;
	public static UserRepository getInstance() 
	{
		if(userRepository == null)
			userRepository = new UserRepository();
			return userRepository;
	}

}
