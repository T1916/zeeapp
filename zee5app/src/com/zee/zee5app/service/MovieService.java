package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.MovieRepository;

public class MovieService 
{
	// service is consuming repository
	private MovieRepository repo = MovieRepository.getInstance();
	
	private MovieService()
	{
		
	}
	
	private static MovieService service = null;
	
	public static MovieService getInstance()
	{
		if(service == null)
			service = new MovieService();
		
		return service;
	}
	
	public String addMovie(Movie movie)
	{
		return this.repo.addMovie(movie);
	}
	
	public Movie getMovieById(Integer id)
	{
		return this.repo.getMovieById(id);
	}
	
	public Movie updateMovie(Integer id)
	{
		return this.repo.updateMovie(id);
	}
	
//	public Movie[] deleteMovie(Integer id)
//	{
//		return this.repo.deleteMovie(id);
//	}
	
	
	public Movie[] getMovies()
	{
		return repo.getMovies();
	}

}
