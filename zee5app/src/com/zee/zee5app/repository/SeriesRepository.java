package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;

public class SeriesRepository 
{
	private Series[] series = new Series[10];
	private static int seriescount = -1;
	
	private SeriesRepository()
	{
		
	}
	
	// to return all the series details
	public Series[] getSeries()
	{
		return series;
	}
	
	public Series getSeriesById(Integer id)
	{
		// do we need to traverse the array? Yes
		
		for (Series series1 : series) 
		{
			if(series1.getSerId().equals(id))
			{
				return series1;
			}
		}
		
		return null;
	}
		
	
	public String addSeries(Series series1)
	{
		if(seriescount == series.length - 1)
		{
			Series temp[] = new Series[series.length*2];
			
			System.arraycopy(series1,  0, temp, 0, series.length);
			series = temp;
			series[++seriescount] = series1;
			
			return "Series Added";
			
		}
		
		series[++seriescount] = series1;
		return "Series Added";
	}
	
	private static SeriesRepository seriesRepository = null;
	public static SeriesRepository getInstance()
	{
		if(seriesRepository == null)
		{
			seriesRepository = new SeriesRepository();
		}
		
		return seriesRepository;
	}
}
