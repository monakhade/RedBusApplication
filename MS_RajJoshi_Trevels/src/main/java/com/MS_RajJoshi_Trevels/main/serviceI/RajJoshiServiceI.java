package com.MS_RajJoshi_Trevels.main.serviceI;

import java.util.List;

import com.MS_RajJoshi_Trevels.main.model.RajJoshiBus;

public interface RajJoshiServiceI {

	public RajJoshiBus SaveBusData(RajJoshiBus rj);

	public List<RajJoshiBus> getAllBusData();

	public List getAllByBsName(String busname);

	public List getBsNameFromTo(String busName, String busFrom, String busTo);

}
