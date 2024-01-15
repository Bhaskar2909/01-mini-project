package com.example.demo.service;

import javax.security.auth.login.AccountException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.DashboardReponse;
import com.example.demo.entity.Counsellor;
import com.example.demo.repo.counsellorRepo;

@Service
public class counsellorserviceImpl implements counsellorservice{

	@Autowired
	private counsellorRepo cnrepo;
	
	@Override
		public String saveCounsellor(Counsellor c) {
			
			Counsellor save = cnrepo.save(c);
			if(save.getId()!=null) {
				return "data inserted successfully";
			}
			else {
				return "data not inserted successfully";
			}
	 
	}

	@Override
	public Counsellor loginCheck(Counsellor c) {
		Counsellor byEmailAndPassword = cnrepo.findByEmailAndPassword(c.getEmail(),c.getPassword());
		return byEmailAndPassword;
	}

	@Override
	public boolean recoverPwd(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DashboardReponse getDashBoardInfo(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counsellor logincheck(String email, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

}
