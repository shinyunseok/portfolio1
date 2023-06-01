package com.company.biz.sport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportService implements SportMapper{
	
	@Autowired
	SportDAO sportDAO;

	@Override
	public List<Sport> getSportList(Sport sport) {
		System.out.println("getSportList Service");
		return sportDAO.getSportList(sport);
	}

	
//	---------------------- 페이징 ---------------------------------
	
	@Override
	public int totalCount(Sport sport) { // 총 게시물 개수
		return	sportDAO.totalCount(sport);
		
	}



}
