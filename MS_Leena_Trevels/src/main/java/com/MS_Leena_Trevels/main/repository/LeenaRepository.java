package com.MS_Leena_Trevels.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MS_Leena_Trevels.main.model.LeenaBusInfo;

public interface LeenaRepository extends JpaRepository<LeenaBusInfo, Integer>
{
	@Query(name="getBytravelName",value="from LeenaBusInfo where busName=?1")
	public List getBytravelName(String busName);
	
	@Query(name="getByNmFromTo",value="from LeenaBusInfo where busName=?1 and busFrom=?2 and busTo=?3")
	public List getBsNameFromTo(String busName, String busFrom, String busTo);

}
