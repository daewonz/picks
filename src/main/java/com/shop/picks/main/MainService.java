package com.shop.picks.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
	@Autowired
	MainMapper mainMapper;
	
	public Boolean insertMember() {
		System.out.println("1431412");
		// TODO Auto-generated method stub
		return mainMapper.insertMember();
	}

	public List<Map<String, Object>> getMembers() {
		// TODO Auto-generated method stub
		return mainMapper.getMembers();
	}

}
