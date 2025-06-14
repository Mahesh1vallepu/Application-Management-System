package com.mahesh.ApplicationManagementSystem.repository;

import com.mahesh.ApplicationManagementSystem.Entity.Applicant;
import org.springframework.data.repository.ListCrudRepository;

public interface ApplicationCrudRepository extends ListCrudRepository<Applicant,Long> {
}
