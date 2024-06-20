package com.portal.jobseeker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.jobapplication.dto.JobApplicationDto;
import com.portal.jobapplication.entity.JobApplication;
import com.portal.jobseeker.dto.JobSeekerDto;
import com.portal.jobseeker.entity.JobSeeker;
import com.portal.jobseeker.service.JobSeekerService;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {
	@Autowired
	JobSeekerService service;
	
	
	@PostMapping("/add/jobseeker")
	public JobSeekerDto addJobSeeker(@RequestBody JobSeeker job) {
		return service.addJobSeeker(job);
		}
	
	@PutMapping("/update/jobseeker/{id}")
	
	public JobSeekerDto updateJobSeeker(@RequestBody JobSeeker job , @PathVariable Integer id) {
		System.out.println(id);
		
		return service.updateJobSeeker(job,id);
	}
	
	@GetMapping("/listofapprovedjobapplication")
	public  List<JobApplicationDto> ListOfApprovedJobApplication()
	{
		return service.ListOfApprovedJobApplication();
	}
}
