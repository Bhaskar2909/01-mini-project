package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.binding.DashboardReponse;
import com.example.demo.entity.Counsellor;

@Service
public interface counsellorservice {

public String saveCounsellor(Counsellor c);
	
	public Counsellor loginCheck(Counsellor c);
	
	public boolean recoverPwd(String email);
	
	public DashboardReponse getDashBoardInfo(Integer cid);

	public Counsellor logincheck(String email, String pwd);
	
}
