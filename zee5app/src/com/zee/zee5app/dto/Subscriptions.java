package com.zee.zee5app.dto;

import lombok.Data;

@Data
public class Subscriptions 
{
	private Integer id;
	private String plan;
	private String DateOfPurchase;
	private String Status;
	private String PackCountry;
	private String PaymentMode;
	private String AutoRenewal;
	private String Expiry;
}
