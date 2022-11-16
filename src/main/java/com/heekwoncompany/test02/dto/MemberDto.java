package com.heekwoncompany.test02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDto {
	
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private String mdate;
}
