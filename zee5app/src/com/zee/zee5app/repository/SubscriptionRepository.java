package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Subscriptions;

public class SubscriptionRepository 
{
	private Subscriptions[] subs = new Subscriptions[10];
	private static int count = -1;
	
	private SubscriptionRepository() 
	{
		
	}
	
	// to return all the subs details
	public Subscriptions[] getSubs()
	{
		return subs;
	}
	
	// search by Id
	public Subscriptions getSubById(Integer id)
	{
		for (Subscriptions subscriptions : subs) 
		{
			if(subscriptions.getId().equals(id))
			{
				return subscriptions;
			}
			
		}
		
		return null;
	}
	
	// add a new sub
	public String addSub(Subscriptions sub)
	{
		if(count == subs.length-1)
		{
			//dynamically growing the size of array
			Subscriptions temp[] = new Subscriptions[subs.length*2];
			
			
			System.arraycopy(subs, 0, temp, 0, subs.length);
			subs = temp;
			subs[++count] = sub;
			
			return "Subscriber Added";
		}
		
		subs[++count] = sub;
		return "Subscriber Added";
	}
	
	private static SubscriptionRepository subRepository = null;
	public static SubscriptionRepository getInstance()
	{
		if(subRepository == null)
		{
			subRepository = new SubscriptionRepository();
		}
		
		return subRepository;
	}
	
}
