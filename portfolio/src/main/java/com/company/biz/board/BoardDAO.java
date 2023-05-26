package com.company.biz.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(Board board) {
		System.out.println("===> MyBatis insertBoard()");
		mybatis.insert("insertBoard", board);
	}

	public List<Board> getBoardList(Board board) {
		System.out.println("getBoardListDAO");
		return mybatis.selectList("getBoardList", board);
	}

	public Board getBoard(Board board) {
		return mybatis.selectOne("getBoard", board);
	}

	
}
