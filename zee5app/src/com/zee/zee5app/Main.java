package com.zee.zee5app;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.dto.Subscriptions;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.UserService;

public class Main 
{
	public static void main(String[] args)
	{
		//Register register = new Register();
		
		//Register : class name
		//register : reference which will refer your object
		//new : used to create the object
		//Register() : default constructor ==> Implicit Default Constructor
		
//		register.setFirstName("tavishi");
//		register.setLastName("singh");
//		register.setEmail("tavishisingh11@gmail.com");
//		register.setPassword("12345");
//		
		
		MovieService movservice = MovieService.getInstance();
		SeriesService seriesservice = SeriesService.getInstance();
		SubscriptionService subservice = SubscriptionService.getInstance();
		
		// adding movies
		for(int i=1; i<=5; i++)
		{
			Movie movie = new Movie();
			movie.setMovId(i);
			movie.setMovYear(i + 2021);
			movie.setMovName("Bob Biswas");
			movie.setMovGenre(new String[] {"Drama", "Thriller", "Suspense", "Crime"});
			movie.setMovLang("Hindi");
			movie.setMovLength("2h11m");
			movie.setMovTrailer("https://youtu.be/5Etb02FzW7o");
			movie.setMovAgeRestriction("U/A 16+");
			movie.setMovAudioAvailable(new String[] {"Hindi"});
			movie.setMovSynopsis("In this ZEE5 Original film, Bob Biswas, a hitman-for-hire, comes out of a prolonged coma and struggles to recall his identity but suffers a moral dilemma when the memories of his past resurface.");
			movie.setMovCast(new String[] { "Abhishek Bachchan", "Chitrangada Singh"});
			
			String result = movservice.addMovie(movie);
			System.out.println(result);
		}
		
		for (Movie moviecounter : movservice.getMovies()) 
		{				
			if(moviecounter!=null)
				System.out.println(moviecounter);
		}
		
		Movie movie = movservice.getMovieById(4);
		{	
			System.out.println(movie!=null);
		}
		
		Movie movie1 = movservice.updateMovie(2);
		System.out.println("Movie Updated");
		System.out.println(movie1);
		
		
//		Movie[] newmovie = new Movie[9];
//		newmovie = movservice.deleteMovie(3);
//		System.out.println(newmovie);
		
		
		// adding series
		for(int i=0; i<=5; i++)
		{
			Series series = new Series();
			series.setSerId(i*10);
			series.setSerYear(i + 2020);
			series.setSerSeasons(2);
			series.setSerType("Web Series");
			series.setSerName("Permanent Roommates");
			series.setSerGenre(new String[] { "Romance", "Comedy"});
			series.setSercast(new String[] { "Nidhi Singh", "Sumeet Vyas"});
			series.setSerLang("Hindi");
			series.setSerLength("36-40min");
			series.setSerTrailer("https://youtu.be/tKNQMYmQjnA");
			series.setSerAgeRestriction("U/A");
			series.setSerAudioAvailable(new String[] { "Hindi", "English"});
			series.setSerSubtitles(new String[] { "English", "Hindi"});
			series.setSerSynopsis("Mikesh and Tanya, a couple who were in a long-distance relationship for three years, suddenly face the prospect of marriage. But are they ready to settle down?");
			
			String result = seriesservice.addSeries(series);
			System.out.println(result);
		}
		
		for (Series seriescounter : seriesservice.getSeries()) 
		{				
			if(seriescounter!=null)
				System.out.println(seriescounter);
		}
		
		for (Series seriescounter : seriesservice.getSeries()) 
		{				
			if(seriescounter!=null)
				System.out.println(seriescounter);
		}
		
		Series series1 = seriesservice.getSeriesById(30);
		{
			System.out.println(series1!=null);
		}
		
		// adding subs details
		for(int i=0; i<=5; i++)
		{
			Subscriptions subs = new Subscriptions();
			subs.setId(i*10);
			subs.setPlan("premium");
			subs.setDateOfPurchase("14 Mar 2021");
			subs.setStatus("Active");
			subs.setPackCountry("India");
			subs.setPaymentMode("PayU");
			subs.setAutoRenewal("No");
			subs.setExpiry("14 Mar 2022");
			
			String result = subservice.addSubs(subs);
			System.out.println(result);
		}
		
		// searching sub with id
		for (Subscriptions subscounter : subservice.getSubs()) 
		{				
			if(subscounter!=null)
				System.out.println(subscounter);
		}
		
		Subscriptions sub = subservice.getSubById(20);
		{	
			System.out.println(sub!=null);
		}
		
		
		
//		System.out.println(register);
		// whenever you will print the reference then it
		//will call toString() method.
//		
//		System.out.println(register.toString());
//		
//		System.out.println(register.getEmail());
		
//		Login login = new Login();
//		
//		login.setUserName("Tavishi Singh");
//		login.setPassword("1234567890");
//		
//		System.out.println(login.getUserName());
//		System.out.println(login.getPassword());
		
		
		
		
//		for(int i=1; i<=20; i++)
//		{
//			Register register2 = new Register();
//			register2.setId("tsk00" + i);
//			register2.setFirstName("tavishi" + i);
//			register2.setLastName("singh" + i);
//			register2.setPassword("1234");
//			String result = service.addUser(register2);
//			System.out.println(result);
//		}
		
		
		
		// userservice object
		// main is consuming the service
//		
//		Register register2 = service.getUserById("tsk");
//		System.out.println(register2!=null);
//		
//		for (Register register3 : service.getUsers()) 
//		{
//			if(register3!=null)
//				System.out.println(register3);
//		}
		
	}

} 
