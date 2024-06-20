package com.portal.jobapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.jobapplication.dto.JobApplicationDto;
import com.portal.jobapplication.entity.JobApplication;
import com.portal.jobapplication.service.JobApplicationServiceImpl;

@RestController
@RequestMapping("/jobapplication")
public class JobApplicationController {
		@Autowired
		JobApplicationServiceImpl jobservice;
		
		
		@PostMapping("/add/jobapplication")
		public JobApplicationDto addJobApplication(@RequestBody JobApplication jobapplication)
		{
			return jobservice.addJobApplication(jobapplication);
		}
}
