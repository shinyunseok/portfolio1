package com.company.view.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.company.biz.sport.Sport;
import com.company.biz.sport.SportService;

@RestController
public class SportController {

	@Autowired
	private SportService sportService;

	@GetMapping("/getSportList.do") // 전체 체육시설조회 및 a태그
	public ModelAndView getSportList(Sport sport, ModelAndView mav) {
		if (sport.getPage() == 0 ) {
			sport.setPage(1);
		}
		
		System.out.println("현재 페이지 : "+sport.getPage());
		System.out.println("전체 페이지 수 : " + sportService.totalCount(sport));
		System.out.println("검색 키워드 " + sport.getSearchKeyword());
		
		
		if (sport.getSearchKeyword() == null) {
			sport.setSearchKeyword("");
			System.out.println("검색 키워드 " + sport.getSearchKeyword());
			System.out.println("검색키워드가 null일때 총 레코드 수 : "+sportService.totalCount(sport));
			mav.addObject("totalCount", sportService.totalCount(sport));
			mav.addObject("sportList", sportService.getSportList(sport));
			mav.setViewName("sport/getSportList");
		}else {
			mav.addObject("sportList", sportService.getSportList(sport));
			mav.addObject("totalCount", sportService.totalCount(sport));
			System.out.println("검색키워드가 null이 아닐때 키워드 : "+sport.getSearchKeyword());
			System.out.println("검색키워드가 null일때 총 레코드 수 : "+sportService.totalCount(sport));
			mav.setViewName("sport/getSportList");
		}
		return mav;
	}

}
