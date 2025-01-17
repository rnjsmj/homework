package com.kh.homework.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.homework.member.model.service.MemberServcie;
import com.kh.homework.member.model.vo.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberServcie memberService;
	private final BCryptPasswordEncoder pwdEncoder;
	
	@GetMapping("loginForm")
	public String loginForm(HttpSession session){
	
		if (session.getAttribute("loginUser") != null) {
			return "redirect:/";
		}
		
		return "member/login";
	}
	
	@PostMapping("login")
	public String login(Member member, HttpSession session, Model model){
		Member loginUser = memberService.findMember(member.getUserId());
		
		String viewName = "";
		
		if (loginUser != null && pwdEncoder.matches(member.getUserPwd(), loginUser.getUserPwd())) {
			session.setAttribute("loginUser", loginUser);
			session.removeAttribute("loginMsg");
			viewName = "redirect:/";
		} else if (loginUser != null && !pwdEncoder.matches(member.getUserPwd(), loginUser.getUserPwd())) {
			session.setAttribute("loginMsg", "비밀번호가 올바르지 않습니다.");
			viewName = "redirect:/loginForm";
		} else {
			session.setAttribute("loginMsg", "등록된 회원정보가 없습니다.");
			viewName = "redirect:/loginForm";
		}
		
		return viewName;
	}
	
	@GetMapping("logout")
	public String login(HttpSession session) {
		
		session.removeAttribute("loginUser");
		
		return "redirect:/";
	}
	
	
	
}
