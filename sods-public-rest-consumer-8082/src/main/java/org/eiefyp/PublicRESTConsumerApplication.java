package org.eiefyp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.eiefyp.feign")
public class PublicRESTConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PublicRESTConsumerApplication.class,args);
    }
}
