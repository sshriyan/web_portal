package com.shriyan;
import com.shriyan.controller.ListingController;
import com.shriyan.domain.GreetingProperties;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import zipkin2.Span;
import zipkin2.reporter.Reporter;

import java.util.logging.Logger;


@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
public class ListingApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(ListingApplication.class, args);
    }


}
