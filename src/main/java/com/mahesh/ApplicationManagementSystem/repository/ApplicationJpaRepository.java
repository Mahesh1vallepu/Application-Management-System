package com.mahesh.ApplicationManagementSystem.repository;

import com.mahesh.ApplicationManagementSystem.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApplicationJpaRepository extends JpaRepository<Applicant, Long> {
    List<Applicant> findByStatus(String status); // Query Methods

    @Query("SELECT a FROM Applicant a WHERE a.name LIKE %:name%") // @Query Annotation
    List<Applicant> findApplicationByPartialName(@Param("name") String name);
}
