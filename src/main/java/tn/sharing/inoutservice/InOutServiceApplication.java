package tn.sharing.inoutservice;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
@Slf4j
public class InOutServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(InOutServiceApplication.class, args);
    }



}
