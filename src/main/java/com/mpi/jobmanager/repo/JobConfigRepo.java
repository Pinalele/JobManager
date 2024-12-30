package com.mpi.jobmanager.repo;

import com.mpi.jobmanager.model.JobEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobConfigRepo extends CrudRepository<JobEntity, Integer> {

    @Query("SELECT j.scheduledTime FROM JobEntity j WHERE j.jobName = :jobName")
    long findScheduledTimeByJobName(@Param("jobName") String jobName);
}
