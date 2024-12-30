package com.mpi.jobmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledJob {
    private static final Logger log = LoggerFactory.getLogger(ScheduledJob.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelayString ="#{@getCronValueJobA}")
    public void JobOne() {
        log.info("JobOne The time is now {}", dateFormat.format(new Date()));
    }


    @Scheduled(fixedDelayString ="#{@getCronValueJobB}")
    public void JobTwo() {
        log.info("JobTwo The time is now {}", dateFormat.format(new Date()));
    }
}
