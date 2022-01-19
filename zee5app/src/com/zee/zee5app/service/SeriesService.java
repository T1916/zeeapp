package com.zee.zee5app.service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.SeriesRepository;

public class SeriesService 
{
	// service is consuming repository
	private SeriesRepository repo = SeriesRepository.getInstance();
	
	private SeriesService()
	{
		
	}
	
	private static SeriesService service = null;
	
	public static SeriesService getInstance()
	{
		if(service == null)
			service = new SeriesService();
		
		return service;
	}
	
	public String addSeries(Series series1)
	{
		return this.repo.addSeries(series1);
	}
	
	public Series getSeriesById(Integer id)
	{
		return this.repo.getSeriesById(id);
	}
	
	
	public Series[] getSeries()
	{
		return repo.getSeries();
	}
}
