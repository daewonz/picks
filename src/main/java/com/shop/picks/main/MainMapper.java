package com.shop.picks.main;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
	
	List<Map<String, Object>> getMembers();


	}

