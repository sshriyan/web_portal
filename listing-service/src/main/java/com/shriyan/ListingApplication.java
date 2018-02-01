package com.shriyan;
import com.shriyan.domain.GreetingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableDiscoveryClient
public class ListingApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(ListingApplication.class, args);
    }
}
