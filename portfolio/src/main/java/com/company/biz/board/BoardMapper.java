package com.company.biz.board;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BoardMapper {
	
	
	@Insert("INSERT INTO BOARD (NO, TITLE, CONTENT, CNT, board_id) VALUES ((SELECT NVL(MAX(NO), 0) + 1 FROM BOARD), #{title}, #{content}, 0,(SELECT user_id FROM users WHERE user_id = #{board_id}))")
	public void insertBoard(Board board);

	@Update("UPDATE BOARD SET CNT=CNT+1 WHERE no=#{no}")
	public void updateCnt(Board vo);
	
	@Select("select * from board order by no desc")
	List<Board> getBoardList(Board board);
	
	@Select("select * from board where no=#{no}")
	Board getBoard(Board board);
	
	
	
//	---------------------- 댓글 ---------------------------------
	
	@Insert("INSERT INTO boardComment(comment_no, idx, comment_id, comment_content) VALUES (#{comment_no}, (SELECT NVL(MAX(idx), 0) + 1 FROM BOARDComment), #{comment_id}, #{comment_content})")
	public void insertComment(BoardComment comment);
	
	@Select("select * from boardComment where comment_no=#{comment_no}")
	List<BoardComment> getCommentList(BoardComment comment);


	
}
