package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;

public class MovieRepository 
{
	private Movie[] movies = new Movie[10];
	private static int count = -1;	
	
	
	private MovieRepository()
	{
		
	}
	
	// to return all the movie details
	public Movie[] getMovies()
	{
		return movies;
	}
	
	
	
	public Movie getMovieById(Integer id)
	{
		// do we need to traverse the array? Yes
		
		for (Movie movie : movies) 
		{
			if(movie.getMovId().equals(id))
			{
				return movie;
			}
		}
		
		return null;
		
	}
	
	
	public Movie updateMovie(Integer id)
	{
		for (Movie movie : movies)
		{
			if(movie.getMovId().equals(id))
			{
				movie.setMovYear(2035);
				movie.setMovLength("1h35m");
				return movie;
			}		
			
		}
		
		return null;
		
	}
	
	// add a new movie
	public String addMovie(Movie movie)
	{
		if(count == movies.length-1)
		{
			//dynamically growing the size of array
			Movie temp[] = new Movie[movies.length*2];
			
			
			System.arraycopy(movies, 0, temp, 0, movies.length);
			movies = temp;
			movies[++count] = movie;
			
			return "Movie Added";
		}
		
		movies[++count] = movie;
		return "Movie Added";
	}
	
	private static MovieRepository movieRepository = null;
	public static MovieRepository getInstance()
	{
		if(movieRepository == null)
		{
			movieRepository = new MovieRepository();
		}
		
		return movieRepository;
	}
	
	
	// to delete a movie
//	public Movie[] deleteMovie(Integer id)
//	{
//		Integer tempcount = 0;
//		Movie temp[] = new Movie[movies.length-1];
//		for (Movie movie : movies) 
//		{
//			if(!movie.getMovId().equals(id))
//			{
//				temp[tempcount++] = movie;
//			}
//			
//		}
//		
//		movies = temp;
//		return movies;
//	}
	
	

}
