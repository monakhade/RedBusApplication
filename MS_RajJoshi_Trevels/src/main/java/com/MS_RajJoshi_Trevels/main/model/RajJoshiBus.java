package com.MS_RajJoshi_Trevels.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class RajJoshiBus 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busId;
	private String busNo;
	private String busName;
	private String busFrom;
	private String busTo;
	private String busDate;
	private String busTimming;
	private float busTicketAmmount;
	
}
