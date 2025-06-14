package com.mahesh.ApplicationManagementSystem.controller;

import com.mahesh.ApplicationManagementSystem.Entity.Applicant;
import com.mahesh.ApplicationManagementSystem.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant>getAllApplicants(){
        return applicantService.getAllApplicants();
    }

    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant){
        return applicantService.saveApplicant(applicant);
    }

    @GetMapping("/page")
    public Iterable<Applicant>getApplicationWithPagination(@RequestParam int page, @RequestParam int size){
        return applicantService.getApplicationWithPagination(page,size);
    }

    @GetMapping("/getByStatus")
    public List<Applicant>getByStatus(@RequestParam String status){
        return applicantService.getByStatus(status);
    }

    @GetMapping("/getByName")
    public  List<Applicant>getApplicationByName(@RequestParam String name){
        return applicantService.getApplicationByName(name);
    }
}
