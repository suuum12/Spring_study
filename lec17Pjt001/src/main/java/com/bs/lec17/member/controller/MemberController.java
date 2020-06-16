package com.bs.lec17.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bs.lec17.member.Member;
import com.bs.lec17.member.service.MemberService;

@Controller
public class MemberController {


	@Autowired
	MemberService service;
	
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
	public String memJoin(Member member) {
			
		service.memberRegister(member.getMemId(), member.getMemPw(), member.getMemMail(), 
				member.getMemPhone1(),member.getMemPhone2(), member.getMemPhone3());		
		
		return "memJoinOk";
	}
	
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public String memLogin(Member member) {
		
		service.memberSearch(member.getMemId(), member.getMemPw());
		
		return "memLoginOk";
	}
	
}