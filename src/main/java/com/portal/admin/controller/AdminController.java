package com.portal.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.admin.service.AdminServiceImpl;
import com.portal.jobapplication.dto.JobApplicationDto;
import com.portal.jobapplication.entity.JobApplication;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminServiceImpl adminservice;
	
	
	@GetMapping("/listofunapprovedjobapplication")
	 public List<JobApplicationDto> ListOfUnapprovedJobApplication()
	 {
		return adminservice.ListOfUnapprovedJobApplication();
	 }
	
	@PutMapping("/approvalbyadmin/{id}")
	public String ApprovalByAdmin(@PathVariable int id)
	{
		adminservice.ApprovalByAdmin(id);
		
		return "Approved";
	}

}
