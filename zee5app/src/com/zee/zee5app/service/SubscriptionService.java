package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Subscriptions;
import com.zee.zee5app.repository.SubscriptionRepository;

public class SubscriptionService 
{
	private SubscriptionRepository repo = SubscriptionRepository.getInstance();
	
	private SubscriptionService()
	{
		
	}
	
	private static SubscriptionService service = null;
	
	public static SubscriptionService getInstance()
	{
		if(service == null)
			service = new SubscriptionService();
		
		return service;
	}
	
	public String addSubs(Subscriptions sub)
	{
		return this.repo.addSub(sub);
	}
	
	public Subscriptions getSubById(Integer id)
	{
		return this.repo.getSubById(id);
	}
	
	
	public Subscriptions[] getSubs()
	{
		return repo.getSubs();
	}

	

}
