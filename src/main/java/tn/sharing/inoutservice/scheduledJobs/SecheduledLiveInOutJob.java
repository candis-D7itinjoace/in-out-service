package tn.sharing.inoutservice.scheduledJobs;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;

@Component
@Slf4j
public class SecheduledLiveInOutJob {

    @Autowired
    private WebClient webClient;

    private int counter = 0;


    @Scheduled(fixedDelay = 4000L)
    public void liveInOut() {
        log.info("hello" + counter);
        counter ++;



    }



}
