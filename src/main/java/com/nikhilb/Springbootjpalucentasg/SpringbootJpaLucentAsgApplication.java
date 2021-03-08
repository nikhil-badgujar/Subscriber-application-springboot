package com.nikhilb.Springbootjpalucentasg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.nikhilb.Springbootjpalucentasg.repository")
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringbootJpaLucentAsgApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaLucentAsgApplication.class, args);
	}

}
