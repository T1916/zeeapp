package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Movie 
{
	private Integer movId;
	private Integer movYear;
	private String movName;
	private String movGenre[];
	private String movLang;
	private String movLength;
	private String movTrailer;
	private String movAgeRestriction;
	private String movAudioAvailable[];
	private String movSynopsis;
	private String movCast[];
	
	
}
