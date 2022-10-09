package com.sibusiso.banking.account.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankingAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAccountServiceApplication.class, args);
	}

}
