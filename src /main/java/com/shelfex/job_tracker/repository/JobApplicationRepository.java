package com.shelfex.job_tracker.repository;

import com.shelfex.job_tracker.model.JobApplication;
import com.shelfex.job_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
    List<JobApplication> findByUser(User user);
}
