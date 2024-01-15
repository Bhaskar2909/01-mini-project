package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.binding.searchcriteria;
import com.example.demo.entity.Studentenq;
import com.example.demo.service.EnquiryService;


@Controller
public class enqcontroller {
	
	@Autowired
	private EnquiryService enqservice;
	
	@GetMapping("/enquiry")
	public String enqPage(Model model) {
		model.addAttribute("enq", new Studentenq());
		return "addEnqView";
	}
	@PostMapping("/enquiry")
	public String addEnquiry(Studentenq se, Model model) {
		boolean addEnq = enqservice.addEnq(se);
		if(addEnq) {
			//success msg
		}else {
			//err mssg
		}
		return "addEnqView";
	}
	
	@GetMapping("/enquiries")
	public String viewEnquiries(Model model) {
		List<Studentenq> enquiriesList = enqservice.getEnquiries(null, null);
		model.addAttribute("enquiries", enquiriesList);
		return "displayEnqView";
	}
	
	@PostMapping("/filter-enquiries")
	public String filterEnquiries(searchcriteria sc, Model model) {
		List<Studentenq> enquiriesList = enqservice.getEnquiries(null, null);
		model.addAttribute("enquiries", enquiriesList);
		return "displayEnqView";
	}


}
