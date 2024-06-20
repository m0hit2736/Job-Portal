package com.portal.jobrecruiter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.jobrecruiter.dto.JobRecruiterDto;
import com.portal.jobrecruiter.entity.JobRecruiter;
import com.portal.jobrecruiter.service.JobRecruiterServiceImpl;

@RestController
@RequestMapping("/jobrecruiter")
public class JobRecruiterController {
	@Autowired
	JobRecruiterServiceImpl recruiterservice;
	
	@PostMapping("/add/jobrecruiter")
	public JobRecruiterDto addJobRecruiter(@RequestBody JobRecruiter job) 
	{
		return recruiterservice.addJobRecruiter(job);
	}
}
