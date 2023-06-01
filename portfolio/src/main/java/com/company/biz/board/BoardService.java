package com.company.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardMapper {

	@Autowired
	BoardDAO boardDAO;

	@Override
	public void insertBoard(Board board) {
		boardDAO.insertBoard(board);
	}

	@Override
	public List<Board> getBoardList(Board board) {
		System.out.println("getBoardList Service");
		return boardDAO.getBoardList(board);
	}

	@Override
	public Board getBoard(Board board) {
		return boardDAO.getBoard(board);
	}

	@Override
	public void updateCnt(Board board) {
		boardDAO.updateCnt(board);
	}

	

	
	
//	---------------------- 댓글 ---------------------------------
	
	@Override
	public void insertComment(BoardComment comment) {
		boardDAO.insertComment(comment);
	}

	@Override
	public List<BoardComment> getCommentList(BoardComment comment) {
		return boardDAO.getCommentList(comment);
	}



}
