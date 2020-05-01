package org.sid;

import org.sid.dao.CompanyRepository;
import org.sid.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class Tp3MiseEnOeuvreArchitectureDistribueApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3MiseEnOeuvreArchitectureDistribueApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompanyRepository companyRepository){
        return args -> {
            companyRepository.save(new Company(null, "ESP", 124.01));
            companyRepository.save(new Company(null, "ESP", 124.01));
            companyRepository.save(new Company(null, "ESP", 124.01));
            companyRepository.save(new Company(null, "ESP", 124.01));
            companyRepository.save(new Company(null, "ESP", 124.01));
            companyRepository.save(new Company(null, "ESP", 124.01));
        };
    }
}
