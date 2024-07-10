package com.MS_RajJoshi_Trevels.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MS_RajJoshi_Trevels.main.model.RajJoshiBus;
import com.MS_RajJoshi_Trevels.main.repository.RajJoshiRepository;
import com.MS_RajJoshi_Trevels.main.serviceI.RajJoshiServiceI;
@Service
public class RajJoshiServiceImpl implements RajJoshiServiceI
{

	@Autowired
	private RajJoshiRepository rr;
	
	@Override
	public RajJoshiBus SaveBusData(RajJoshiBus rj) 
	{
		RajJoshiBus rb=rr.save(rj);
		return rb;
	}

	@Override
	public List<RajJoshiBus> getAllBusData() 
	{
		List<RajJoshiBus>list=rr.findAll();
		return list;
	}

	@Override
	public List getAllByBsName(String busName) 
	{
		List list=rr.getBytravelName(busName);
		return list;
	}

	@Override
	public List getBsNameFromTo(String busName, String busFrom, String busTo) 
	{
		List list=rr.getBsNameFromTo(busName,busFrom,busTo);
		return list;
	}

	

}
