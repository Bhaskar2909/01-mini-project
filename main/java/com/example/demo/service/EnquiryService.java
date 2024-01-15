package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.binding.searchcriteria;
import com.example.demo.entity.Studentenq;

@Service
public interface EnquiryService {

	public boolean addEnq(Studentenq se);
	
	public List<Studentenq> getEnquiries(Integer cid, searchcriteria s);

}
