package com.MS_Leena_Trevels.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MS_Leena_Trevels.main.Service.LeenaServiceI;
import com.MS_Leena_Trevels.main.model.LeenaBusInfo;
import com.MS_Leena_Trevels.main.serviceImpl.LeenaServiceImpl;

@RestController
public class HomeController 
{
	@Autowired
	private LeenaServiceI ls;
	
	@GetMapping("/")
	public String PreLogin()
	{
		return "Welcome to RajJoshiTrevels...!!";
	}
	
	@PostMapping("/SaveBusData")
	public LeenaBusInfo saveDta(@RequestBody LeenaBusInfo lb)
	{
		LeenaBusInfo li=ls.SaveBusData(lb);
		return li;
		
	}
	@GetMapping("/getAllBusData")
	public List<LeenaBusInfo> AllBusData()
	{
		return ls.getAllBusData();
		
	}
	@GetMapping("/getAllByBusName/{busname}")
	public List getAllByBsName(@PathVariable String busName)
	{
		List al=ls.getAllByBsName(busName);
		return al;
		
	}
	@GetMapping("/getByBsNmFromTo/{busname}/{busFrom}/{busTo}")
	public List getBsNameFromTo(@PathVariable String busName,@PathVariable String busFrom,@PathVariable String busTo)
	{
		List al=ls.getBsNameFromTo(busName,busFrom,busTo);
		return al;
		
	}
}
