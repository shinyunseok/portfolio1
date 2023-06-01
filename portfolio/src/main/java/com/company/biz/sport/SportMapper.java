package com.company.biz.sport;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SportMapper {
	
	
	
//	@Select({
//	    "<script>",
//	    "SELECT rownum as rnum, facility_name, event, road_address, landlot_address, management_agency, operating_entity, contact_number, usage_free FROM public_sports_facility",
//	    "WHERE 1=1",
//	    "<if test=\"searchKeyword != '기타'\">",
//	    "AND event LIKE '%'|| #{searchKeyword} ||'%'",
//	    "</if>",
//	    "<if test=\"searchKeyword == '기타'\">",
//	    "AND event NOT IN ('축구', '농구', '풋살', '탁구', '족구', '헬스', '야구', '테니스', '배드민턴', '게이트볼', '다목적')",
//	    "</if>",
//	    "</script>"
//	})
//	List<Sport> getSportList(Sport sport);

//	---------------------- 페이징 ---------------------------------
	
	@Select({
	    "<script>",
	    "SELECT COUNT(*) FROM public_sports_facility",
	    "WHERE 1=1",
	    "<if test=\"searchKeyword != null\">",
	    "AND event LIKE '%'|| #{searchKeyword} ||'%'",
	    "</if>",
	    "<if test=\"searchKeyword == '기타'\">",
	    "AND event NOT IN ('축구', '농구', '풋살', '탁구', '족구', '헬스', '야구', '테니스', '배드민턴', '게이트볼', '다목적')",
	    "</if>",
	    "</script>"
	})
	int totalCount(Sport sport);

	
	@Select({
	    "<script>",
	    "SELECT rownum as rnum, facility_name, event, road_address, landlot_address, management_agency, operating_entity, contact_number, usage_free FROM (",
	    "SELECT rownum AS rn, facility_name, event, road_address, landlot_address, management_agency, operating_entity, contact_number, usage_free FROM public_sports_facility",
	    "WHERE 1=1",
	    "<if test=\"searchKeyword != '기타'\">",
	    "AND event LIKE '%'|| #{searchKeyword} ||'%'",
	    "</if>",
	    "<if test=\"searchKeyword == '기타'\">",
	    "AND event NOT IN ('축구', '농구', '풋살', '탁구', '족구', '헬스', '야구', '테니스', '배드민턴', '게이트볼', '다목적')",
	    "</if>",
	    ") WHERE rn BETWEEN #{page}*10-9 AND #{page}*10",
	    "</script>"
	})
	List<Sport> getSportList(Sport sport);

	
}
