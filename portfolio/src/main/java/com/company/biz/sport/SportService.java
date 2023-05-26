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

//	@Override
//	public List<Sport> getSoccerList(Sport sport) {
//		System.out.println("getSoccerList Service");
//		return sportDAO.getSoccerList(sport);
//	}

}
