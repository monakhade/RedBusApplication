package com.MS_Leena_Trevels.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MS_Leena_Trevels.main.Service.LeenaServiceI;
import com.MS_Leena_Trevels.main.model.LeenaBusInfo;
import com.MS_Leena_Trevels.main.repository.LeenaRepository;

@Service
public class LeenaServiceImpl implements LeenaServiceI
{
    @Autowired
    private LeenaRepository lr;
    
    @Override
	public LeenaBusInfo SaveBusData(LeenaBusInfo lb) 
	{
    	LeenaBusInfo li=lr.save(lb);
		return li;
	}

	@Override
	public List<LeenaBusInfo> getAllBusData() 
	{
		List<LeenaBusInfo>list=lr.findAll();
		return list;
	}

	@Override
	public List getAllByBsName(String busName) 
	{
		List list=lr.getBytravelName(busName);
		return list;
	}

	@Override
	public List getBsNameFromTo(String busName, String busFrom, String busTo) 
	{
		List list=lr.getBsNameFromTo(busName,busFrom,busTo);
		return list;
	}

	 
}
