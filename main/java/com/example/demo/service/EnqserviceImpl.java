package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.binding.searchcriteria;
import com.example.demo.entity.Studentenq;

@Service
public class EnqserviceImpl implements EnquiryService {

	@Override
	public boolean addEnq(Studentenq se) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Studentenq> getEnquiries(Integer cid, searchcriteria s) {
		// TODO Auto-generated method stub
		return null;
	
	}

}
