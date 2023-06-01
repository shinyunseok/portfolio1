package com.company.view.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.company.biz.user.User;
import com.company.biz.user.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/insertUser.do") // insertUser 페이지로 
	public ModelAndView insertUserView(ModelAndView mav) {
		mav.setViewName("user/insertUser");
		return mav;
	}
	
	@PostMapping("insertUser.do") // 회원가입
	public ModelAndView insertUser(User user,ModelAndView mav) {
		userService.insertUser(user);
		mav.setViewName("user/insertUserSuccess");
		return mav;
	}
	
	@GetMapping("/login.do")
	   public ModelAndView loginView(ModelAndView mav) {
	      mav.setViewName("user/login");
	      return mav;
	}
	
	@PostMapping("/login.do") // 로그인 처리
	   public ModelAndView login(User user,HttpSession session,ModelAndView mav) {
	      System.out.println("controller login 처리");
	      if(userService.login(user)!=null) {
	         System.out.println("로그인 처리");
	         session.setAttribute("user_name",userService.login(user).getUser_name());
	         session.setAttribute("user_id",userService.login(user).getUser_id());
	         mav.setViewName("user/index");
	      }else {
	         mav.setViewName("redirect:user/login.do");
	      }
	      return mav;
	   }
	
	
	@GetMapping("/logout.do")
	public ModelAndView logout(HttpSession session,ModelAndView mav) {
		System.out.println("controller 로그아웃");
		session.invalidate();
		mav.setViewName("redirect:index.html");
		return mav;
	}
	
}
