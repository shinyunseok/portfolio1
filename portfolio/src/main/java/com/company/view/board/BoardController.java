package com.company.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.company.biz.board.Board;
import com.company.biz.board.BoardComment;
import com.company.biz.board.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@GetMapping("/getBoardList.do")
	public ModelAndView getBoardList(ModelAndView mav,Board board) {
		mav.addObject("boardList", boardService.getBoardList(board));
		System.out.println("getBoardList controller 동작확인");
		mav.setViewName("board/getBoardList");
		return mav;
	}
	
	@GetMapping("/getBoard.do")
	public ModelAndView getBoard(ModelAndView mav,Board board,BoardComment comment) {
		if(comment.getComment_no()==0) {
			comment.setComment_no(board.getNo());
		}
		mav.addObject("board", boardService.getBoard(board));
		mav.addObject("commentList", boardService.getCommentList(comment));
		boardService.updateCnt(board);
		System.out.println(comment.getComment_no()+"입니다"+board.getNo());
		System.out.println("getBoard controller 동작확인");
		mav.setViewName("board/getBoard");
		return mav;
	}
	
	@GetMapping("/insertBoard.do")
	public ModelAndView insertBoardView(ModelAndView mav) {
		System.out.println("insertBoardView controller 동작확인");
		mav.setViewName("board/insertBoard");
		return mav;
	}
	
	@PostMapping("/insertBoard.do")
	public ModelAndView insertBoard(ModelAndView mav,Board board) {
		System.out.println("글등록 동작확인");
		boardService.insertBoard(board);
		mav.setViewName("redirect:getBoardList.do");
		return mav;
	}
	
//	---------------------- 댓글 ---------------------------------
	
	@PostMapping("/insertComment.do")
	public ModelAndView insertComment(ModelAndView mav,BoardComment board) {
		System.out.println("insertBoardView controller 동작확인");
		System.out.println("------"+board.getComment_id()+":"+board.getComment_content());
		boardService.insertComment(board);
		mav.setViewName("redirect:getBoardList.do");
		return mav;
	}
	
	
	
}
