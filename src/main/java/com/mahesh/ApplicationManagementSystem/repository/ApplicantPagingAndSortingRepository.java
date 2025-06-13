package com.mahesh.ApplicationManagementSystem.repository;

import com.mahesh.ApplicationManagementSystem.Entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicantPagingAndSortingRepository extends PagingAndSortingRepository<Applicant,Long>{
}
