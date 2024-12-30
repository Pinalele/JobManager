package com.mpi.jobmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobEntity {

    @Id
    private int id;

    private String jobName;

    private long scheduledTime;
}
