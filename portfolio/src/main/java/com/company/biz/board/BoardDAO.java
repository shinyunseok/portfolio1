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
	
	public void updateCnt(Board board) {
		System.out.println("조회수 증가");
		mybatis.update("updateCnt", board);
	}
	
	
	
//	---------------------- 댓글 ---------------------------------
	
	public void insertComment(BoardComment comment) {
		System.out.println("댓글");
		mybatis.insert("insertComment", comment);
	}

	public List<BoardComment> getCommentList(BoardComment comment) {
		return mybatis.selectList("getCommentList", comment);
	}
}
