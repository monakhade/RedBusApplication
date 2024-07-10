package com.MS_RajJoshi_Trevels.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MS_RajJoshi_Trevels.main.model.RajJoshiBus;
import com.MS_RajJoshi_Trevels.main.serviceI.RajJoshiServiceI;

@RestController
public class HomeCotroller 
{
	@Autowired
	private RajJoshiServiceI rs;
	
	@GetMapping("/")
	public String PreLogin()
	{
		return "Welcome to RajJoshiTrevels...!!";
	}
	
	@PostMapping("/SaveBusData")
	public RajJoshiBus saveDta(@RequestBody RajJoshiBus rj)
	{
		RajJoshiBus rb=rs.SaveBusData(rj);
		return rb;
		
	}
	@GetMapping("/getAllBusData")
	public List<RajJoshiBus> AllBusData()
	{
		return rs.getAllBusData();
		
	}
	@GetMapping("/getAllByBusName/{busname}")
	public List getAllByBsName(@PathVariable String busname)
	{
		List al=rs.getAllByBsName(busname);
		return al;
		
	}
	@GetMapping("/getByBsNmFromTo/{busname}/{busFrom}/{busTo}")
	public List getBsNameFromTo(@PathVariable String busName,@PathVariable String busFrom,@PathVariable String busTo)
	{
		List al=rs.getBsNameFromTo(busName,busFrom,busTo);
		return al;
		
	}
}
