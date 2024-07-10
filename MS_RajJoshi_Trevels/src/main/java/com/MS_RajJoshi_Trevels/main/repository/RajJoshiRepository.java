package com.MS_RajJoshi_Trevels.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MS_RajJoshi_Trevels.main.model.RajJoshiBus;
@Repository
public interface RajJoshiRepository extends JpaRepository<RajJoshiBus, Integer>
{
	@Query(name="getBytravelName",value="from RajJoshiBus where busName=?1")
	public List getBytravelName(String busName);
	
	@Query(name="getByNmFromTo",value="from RajJoshiBus where busName=?1 and busFrom=?2 and busTo=?3")
	public List getBsNameFromTo(String busName, String busFrom, String busTo);

}
