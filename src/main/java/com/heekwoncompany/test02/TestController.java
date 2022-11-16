package com.heekwoncompany.test02;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heekwoncompany.test02.dao.IDao;
import com.heekwoncompany.test02.dto.MemberDto;

@Controller
public class TestController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "join")
	public String join() {
		return "join";
	}
	
	@RequestMapping(value = "joinMember")
	public String joinMember(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		dao.joinMemberDao(mid, mpw, mname, memail);
		
		model.addAttribute("mid", mid);
		
		return "joinOk";
	}
	
	@RequestMapping(value = "joinOk")
	public String joinOk() {
		
		return "joinOk";
	}
	
	@RequestMapping(value = "member")
	public String member(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		ArrayList<MemberDto> dtos = dao.memberListDao();
		
		model.addAttribute("minfo", dtos);
		
		return "member";
	}
	
	@RequestMapping(value = "idSearch")
	public String idSearch() {
		
		return "idSearch";
	}
	
	@RequestMapping(value = "idOk")
	public String idOk(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		String mid = request.getParameter("searchId");
		
		MemberDto dto = dao.idSearchDao(mid);
		
		model.addAttribute("searchResult", dto);
		
		return "idOk";
	}
	
}
