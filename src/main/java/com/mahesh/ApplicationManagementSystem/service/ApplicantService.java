package com.mahesh.ApplicationManagementSystem.service;

import com.mahesh.ApplicationManagementSystem.Entity.Applicant;
import com.mahesh.ApplicationManagementSystem.repository.ApplicantPagingAndSortingRepository;
import com.mahesh.ApplicationManagementSystem.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private CrudRepository crudRepository;

    @Autowired
    private ApplicantPagingAndSortingRepository applicantPagingAndSortingRepository;

    public List<Applicant> getAllApplicants(){
        Iterable<Applicant>all =  crudRepository.findAll();
        List<Applicant>applicantList = new ArrayList<>();
        all.forEach(applicantList::add);
        return applicantList;
    }

    public Applicant saveApplicant(Applicant applicant){
        return crudRepository.save(applicant);
    }

    public Iterable<Applicant>getApplicationWithPagination(int page, int size){
        return applicantPagingAndSortingRepository.findAll(PageRequest.of(page,size));
    }
}
