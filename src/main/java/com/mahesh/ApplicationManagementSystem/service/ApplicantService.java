package com.mahesh.ApplicationManagementSystem.service;

import com.mahesh.ApplicationManagementSystem.Entity.Applicant;
import com.mahesh.ApplicationManagementSystem.repository.ApplicantPagingAndSortingRepository;
import com.mahesh.ApplicationManagementSystem.repository.ApplicationCrudRepository;
import com.mahesh.ApplicationManagementSystem.repository.ApplicationJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicationCrudRepository crudRepository;

    @Autowired
    private ApplicantPagingAndSortingRepository applicantPagingAndSortingRepository;

    @Autowired
    private ApplicationJpaRepository applicationJpaRepository;

    public List<Applicant> getAllApplicants(){
        return crudRepository.findAll();
    }

    public List<Applicant>getByStatus(String status){
        return applicationJpaRepository.findByStatus(status);
    }

    public List<Applicant>getApplicationByName(String name){
        return applicationJpaRepository.findApplicationByPartialName(name);
    }

    public Applicant saveApplicant(Applicant applicant){
        return crudRepository.save(applicant);
    }

    public Iterable<Applicant>getApplicationWithPagination(int page, int size){
        return applicantPagingAndSortingRepository.findAll(PageRequest.of(page,size));
    }
}
