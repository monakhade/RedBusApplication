package com.MS_Leena_Trevels.main.Service;

import java.util.List;

import com.MS_Leena_Trevels.main.model.LeenaBusInfo;

public interface LeenaServiceI {

	public LeenaBusInfo SaveBusData(LeenaBusInfo lb);

	public List<LeenaBusInfo> getAllBusData();

	public List getAllByBsName(String busName);

	public List getBsNameFromTo(String busName, String busFrom, String busTo);

}
