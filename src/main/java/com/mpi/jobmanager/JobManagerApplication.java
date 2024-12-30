package com.mpi.jobmanager;

import com.mpi.jobmanager.repo.JobConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JobManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobManagerApplication.class, args);
    }
    @Autowired
    private JobConfigRepo cronRepo;

    @Bean
    public long getCronValueJobA()
    {
        return cronRepo.findScheduledTimeByJobName("jobA");
    } @Bean
    public long getCronValueJobB()
    {
        return cronRepo.findScheduledTimeByJobName("jobB");
    }
}
