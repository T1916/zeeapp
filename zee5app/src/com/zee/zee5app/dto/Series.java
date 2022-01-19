package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Series 
{
	private Integer serId;
	private Integer serYear;
	private Integer serSeasons;
	private String serType;
	private String serName;
	private String serGenre[];
	private String sercast[];
	private String serLang;
	private String serLength;
	private String serTrailer;
	private String serAgeRestriction;
	private String serAudioAvailable[];
	private String serSubtitles[];
	private String serSynopsis;
}
