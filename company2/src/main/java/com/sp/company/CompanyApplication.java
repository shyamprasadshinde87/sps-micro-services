package com.sp.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableDiscoveryClient
@SpringBootApplication
//@EnableJpaAuditing
public class CompanyApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CompanyApplication.class, args);
	}

}
