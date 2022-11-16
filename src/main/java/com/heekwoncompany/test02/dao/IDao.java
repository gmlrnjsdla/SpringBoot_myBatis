package com.heekwoncompany.test02.dao;

import java.util.ArrayList;

import com.heekwoncompany.test02.dto.MemberDto;

public interface IDao {
	
	public void joinMemberDao(String mid, String mpw, String mname, String memail);
	public ArrayList<MemberDto> memberListDao();
	public MemberDto idSearchDao(String mid);
}
